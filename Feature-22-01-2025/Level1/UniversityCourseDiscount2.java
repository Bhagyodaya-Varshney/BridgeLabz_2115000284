import java.util.Scanner;

public class UniversityCourseDiscount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the course price:");
        int coursePrice = sc.nextInt();
        System.out.println("Enter the discount percentage:");
        int discount = sc.nextInt();
        int discountAmount = (coursePrice * discount) / 100;
        int finalPrice = coursePrice - discountAmount;
        System.out.println(
                "The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalPrice);
    }
}
