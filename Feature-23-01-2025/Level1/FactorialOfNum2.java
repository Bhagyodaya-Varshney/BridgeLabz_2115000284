import java.util.*;
public class FactorialOfNum2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int factorial = 1;
        for(int i=2;i<=n;i++)    factorial *= i;
        System.out.print("Factorial of"+n+"is"+factorial);
    }
}