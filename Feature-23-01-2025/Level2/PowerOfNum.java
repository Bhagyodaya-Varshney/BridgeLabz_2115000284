import java.util.*;
public class PowerOfNum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        System.out.print("Enter power:");
        int p = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= p; i++) {
            result *= n;
        }
        System.out.println("Result is:"+result);
    }
}