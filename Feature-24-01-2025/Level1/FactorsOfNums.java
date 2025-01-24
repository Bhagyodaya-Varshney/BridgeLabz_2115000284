import java.util.*;

public class FactorsOfNums{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int idx = 0;
		
		for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (idx == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[idx++] = i;
            }
        }
		
		System.out.println("Factors:");
        for (int i = 0; i < idx; i++) System.out.print(factors[i] + " ");
	}
}