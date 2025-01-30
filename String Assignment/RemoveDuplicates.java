import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String st = sc.next();
        
        String result = removeDuplicates(st);
        
        System.out.print("String after Duplicate Removed: " + result);
    }

    public static String removeDuplicates(String str) {
        String ans = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ans.indexOf(ch) == -1) {
                ans += ch;
            }
        }
        
        return ans;
    }
}
