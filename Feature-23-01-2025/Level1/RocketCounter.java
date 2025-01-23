import java.util.*;

public class RocketCounter{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the CountDown: ");
        int countDown = sc.nextInt();
        while(countDown >= 1){
            System.out.println(countDown);
            countDown--;
        }
    }
}