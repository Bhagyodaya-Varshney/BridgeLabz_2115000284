import java.util.Scanner;

class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to find Quotient and Reminder");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("The Quotient is " + (number1 / number2) + " and Reminder is " + (number1 % number2)
                + " of two number " + number1 + " and " + number2);
    }
}