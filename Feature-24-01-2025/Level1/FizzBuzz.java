import java.util.*;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Positive Num: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Enter only Positive Number");
            return;
        }

        String[] ans = new String[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                ans[i] = "Fizz";
            } else if (i % 5 == 0) {
                ans[i] = "Buzz";
            } else {
                ans[i] = String.valueOf(i);
            }
        }

        for (int i = 1; i < ans.length; i++) System.out.println("Position " + i + " = " + ans[i]);

    }
}
