import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String st1 = sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String st2 = sc.nextLine();

        if (anagramOrNot(st1, st2)) 
            System.out.print("Both Strings are Anagram");
        else 
            System.out.print("Both Strings are Not Anagram");
    }

    public static boolean anagramOrNot(String st1, String st2) {
        if (st1.length() != st2.length()) return false;

        int[] freq = new int[256];

        for (int i = 0; i < st1.length(); i++) {
            freq[st1.charAt(i)]++;
            freq[st2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) return false;
        }

        return true;
    }
}
