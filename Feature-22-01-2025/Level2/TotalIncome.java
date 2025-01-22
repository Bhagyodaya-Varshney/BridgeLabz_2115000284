import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary and bonus to calculate the Total Income");
        double salary = sc.nextDouble();
        double bonus = sc.nextDouble();
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR "
                + (salary + bonus));

    }
}
