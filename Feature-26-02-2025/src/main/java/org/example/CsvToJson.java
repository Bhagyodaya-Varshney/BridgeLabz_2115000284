package org.example;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.*;

public class CsvToJson{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("info.csv"));
        String header = br.readLine();
        String[] keys = header.split(",");

        JSONArray jsonArray = new JSONArray();
        String line;
        
        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            JSONObject obj = new JSONObject();
            for (int i = 0; i < keys.length; i++) {
                obj.put(keys[i], values[i]);
            }
            jsonArray.put(obj);
        }
        br.close();

        System.out.println(jsonArray);
    }
}
