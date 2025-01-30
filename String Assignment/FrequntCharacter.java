import java.util.*;

public class FrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String st = sc.nextLine();

        char mostFreqChar = findMostFrequentCharacter(st);
        System.out.print("Most Frequent Character: " + mostFreqChar);
    }

    public static char findMostFrequentCharacter(String str) {
        int[] freq = new int[256];

        int maxFreq = 0;
        char mostFreqChar = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;

            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFreqChar = ch;
            }
        }

        return mostFreqChar;
    }
}
