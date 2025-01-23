import java.util.*;
public class MultipleOfNum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num:");
        int n = sc.nextInt();
        System.out.println("Multiples are:")
        for (int i = 1; i < 100; i++) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }
}