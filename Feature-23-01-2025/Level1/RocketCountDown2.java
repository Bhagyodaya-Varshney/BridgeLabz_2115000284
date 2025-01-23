import java.util.*;
public class RocketCountDown2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Counter:");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--)   System.out.println(i);
    }
}