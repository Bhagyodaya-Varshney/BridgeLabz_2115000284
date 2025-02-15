import java.util.*;

class SearchWord{
    public static String findWord(String[] sentences, String word) {
        for (String s : sentences) {
            if (s.contains(word)) {
                return s;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number of sentences:");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] sentences = new String[n];
        System.out.println("Enter the sentences:");
        for (int i = 0; i < n; i++) {
            sentences[i] = sc.nextLine();
        }

        System.out.println("Enter the word to search:");
        String word = sc.nextLine();

        String result = findWord(sentences, word);
        System.out.println("Sentence containing Word: " + result);
    }
}
