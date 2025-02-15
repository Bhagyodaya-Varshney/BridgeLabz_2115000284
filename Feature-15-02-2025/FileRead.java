import java.io.*;

class FileRead {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("TestFile.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
