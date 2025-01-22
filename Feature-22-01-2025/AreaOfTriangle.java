import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        int base = sc.nextInt();
        System.out.println("Enter the height of the triangle");
        int height = sc.nextInt();
        int area = (base * height) / 2;
        System.out.println("The area of the triangle in Square Inches " + area);
        System.out.println("The area of the triangle in Square Cm " + area * 6.4516);
    }
}
