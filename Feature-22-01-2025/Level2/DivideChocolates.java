import java.util.Scanner;

public class DivideChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of chocolates and children to divide the chocolates");
        int numOfChocolates = sc.nextInt();
        int numOfChildren = sc.nextInt();
        System.out.println("The number of chocolates each child gets is " + (numOfChocolates / numOfChildren)
                + " and the number of remaining chocolates are " + (numOfChocolates % numOfChildren));

    }
}