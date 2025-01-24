import java.util.*;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int[] ans = new int[10];

        for (int i = 0; i < ans.length; i++) ans[i] = n * (i + 1);

        for (int i = 0; i < ans.length; i++) System.out.println(n+ " * " + (i + 1) + " = " + ans[i]);

    }
}