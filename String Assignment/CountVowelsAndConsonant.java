import java.util.*;

public class CountVowelsAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String st = sc.next();
        
        int[] counts = countVowelsAndConsonants(st);
        
        System.out.println("Vowels count in given String is " + counts[0]);
        System.out.println("Consonant count in given String is " + counts[1]);
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowelsCount = 0;
        int consonantCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (isVowel(ch)) {
                vowelsCount++;
            } else if (Character.isLetter(ch)) {
                consonantCount++;
            }
        }
        return new int[]{vowelsCount, consonantCount};
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
