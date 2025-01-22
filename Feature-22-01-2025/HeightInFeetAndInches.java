import java.util.Scanner;

public class HeightInFeetAndInches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height in Cm:");
        int cm = sc.nextInt();

        int feet = (int) (cm / 30.48);
        int inches = (int) ((cm / 2.54) % 12);

        System.out.println("The height in feet is " + feet + " and inches is " + inches);
    }
}
