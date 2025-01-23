import java.util.*;
public class FactorialOfNum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int factorial = 1;
        int i = 1;

        while (i <= num) {
            factorial *= i;
            i++;
        }
        System.out.print("Factorial of "+n+" is "+factorial);
    }
}