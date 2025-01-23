import java.util.*;
public class NumPositiveOrNegativeOrZero{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println((num > 0 ? "Positive" : (num < 0 ? "Negative" : "Zero")));
    }
}