import java.util.*;

public class MultiplicationTable{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int[] ans = new int[4];

        for (int i = 6; i <= 9; i++) {
            ans[i - 6] = n * i;
        }

        for (int i = 6; i <= 9; i++) System.out.println(n + " * " + i + " = " + ans[i - 6]);
	}
}