package org.example;

import org.json.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class IPLCensor {
    private static void processJSON(String inputFile, String outputFile) throws IOException {
        String inputJson = new String(Files.readAllBytes(Paths.get(inputFile)));
        JSONArray matches = new JSONArray(inputJson);

        for (int i = 0; i < matches.length(); i++) {
            JSONObject match = matches.getJSONObject(i);

            match.put("team1", censorTeamName(match.getString("team1")));
            match.put("team2", censorTeamName(match.getString("team2")));

            JSONObject score = match.getJSONObject("score");
            JSONObject newScore = new JSONObject();
            for (String key : score.keySet()) {
                newScore.put(censorTeamName(key), score.getInt(key));
            }
            match.put("score", newScore);

            match.put("player_of_match", "REDACTED");

            match.put("winner", censorTeamName(match.getString("winner")));
        }

        Files.write(Paths.get(outputFile), matches.toString(4).getBytes());
        System.out.println("DONE");
    }
    private static void processCSV(String inputFile, String outputFile) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(inputFile));
        List<String> censoredLines = new ArrayList<>();

        censoredLines.add(lines.get(0));

        for (int i = 1; i < lines.size(); i++) {
            String[] values = lines.get(i).split(",");

            values[1] = censorTeamName(values[1]);
            values[2] = censorTeamName(values[2]);
            values[5] = censorTeamName(values[5]);

            values[6] = "REDACTED";

            censoredLines.add(String.join(",", values));
        }

        Files.write(Paths.get(outputFile), censoredLines);
        System.out.println("DONE");
    }
    public static String censorTeamName(String team) {
        String[] words = team.split(" ");
        words[words.length - 1] = "***";
        return String.join(" ", words);
    }
    public static void main(String[] args) throws IOException {
        String jsonInputFile = "IPLJSON.json";
        String csvInputFile = "IPLCSV.csv";

        String jsonOutputFile = "IPLJSON_Censored.json";
        String csvOutputFile = "IPLCSV_Censored.csv";

        processJSON(jsonInputFile, jsonOutputFile);
        processCSV(csvInputFile, csvOutputFile);
    }
}
