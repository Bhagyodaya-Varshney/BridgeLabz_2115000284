import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to swap them");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The swapped numbers are " + num1 + " and " + num2);
    }
}
