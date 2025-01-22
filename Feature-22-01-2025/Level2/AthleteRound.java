import java.util.Scanner;

public class AthleteRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle to calculate the number of rounds the athlete will run to complete 5 km");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        double perimeter = s1 + s2 + s3;
        double r = 5000 / perimeter;
        System.out.println("The total number of round the athlete will run is " + r + " to complete 5 km");

    }
}
