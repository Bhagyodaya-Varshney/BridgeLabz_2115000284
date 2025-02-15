import java.io.*;

class CountWordsInFile{
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("TestFile.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
			int count = 0;
			String word = "Hello";
            while ((line = br.readLine()) != null) {
				String[]words = line.split("\\s+|\\p{Punct}");
				for(String w : words)
					if(w.equals(word))
						count++;
            }
			System.out.println("Count Of Words: "+count);

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
