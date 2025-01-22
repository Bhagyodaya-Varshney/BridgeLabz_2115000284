import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight in pounds to convert it into kilograms");
        double weight = sc.nextDouble();
        double weightInKg = weight / 2.2;
        System.out.println("The weight of the person in pound is " + weight + " and in kg is " + weightInKg);
    }
}
