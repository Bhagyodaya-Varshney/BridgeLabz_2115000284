import java.util.*;
public class SumOfNumUntilZero2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            if(num == 0 || num>0)    break;
            sum += num;
        }
        System.out.println("The sum of the numbers is: "+sum);
    }
}