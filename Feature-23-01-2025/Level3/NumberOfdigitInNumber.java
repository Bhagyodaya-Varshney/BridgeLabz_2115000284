import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count = 0;
        
        if(n<=0)    n*=-1;

        while (n != 0) {
            n /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}
