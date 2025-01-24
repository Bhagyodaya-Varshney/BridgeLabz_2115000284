import java.util.*;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        String numberStr = Integer.toString(n);
        int len = numberStr.length();
        int[] digit = new int[len];
        
        for (int i = 0; i < len; i++) {
            digit[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        
        System.out.print("Reversed number: ");
        for(int i=len-1;i>=0;i--)	System.out.print(digit[i]);
    }
}
