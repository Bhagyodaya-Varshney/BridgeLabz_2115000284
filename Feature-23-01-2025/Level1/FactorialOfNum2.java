import java.util.*;
public class FactorialOfNum2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int factorial = 1;
        if(n<0){
            System.out.print("Factorial of negative number is not possible");
            return;
        }
        for(int i=2;i<=n;i++)    factorial *= i;
        System.out.print("Factorial of"+n+"is"+factorial);
    }
}