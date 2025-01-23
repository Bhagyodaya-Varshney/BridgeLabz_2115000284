import java.util.*;
public class PrimeOrNot{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num:");
        int n = sc.nextInt();
        if (n <= 1) System.out.println(n + " is NOT a Prime Number.");
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }
    }
}