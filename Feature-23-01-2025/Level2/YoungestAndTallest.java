import java.util.*;
public class YoungestAndTallest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age and height for Amar:");
        int amarAge = scanner.nextInt();
        double amarHeight = scanner.nextDouble();

        System.out.println("Enter age and height for Akbar:");
        int akbarAge = scanner.nextInt();
        double akbarHeight = scanner.nextDouble();

        System.out.println("Enter age and height for Anthony:");
        int anthonyAge = scanner.nextInt();
        double anthonyHeight = scanner.nextDouble();

        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

        System.out.println("Youngest friend's age: " + youngestAge);
        System.out.println("Tallest friend's height: " + tallestHeight);
    }
}