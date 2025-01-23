import java.util.*;
public class BonusOfEmp{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary:");
        int Salary = sc.nextInt();
        System.out.print("Enter Service Years:");
        int year = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: " + bonus);
        } else {
            System.out.println("No bonus");
        }
    }
}