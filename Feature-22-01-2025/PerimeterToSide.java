import java.util.Scanner;

public class PerimeterToSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perimeter of the square");
        int perimeter = sc.nextInt();
        int side = perimeter / 4;
        System.out.println("The length of the side is " + side+ " if the perimeter is "+perimeter);
    }
}
