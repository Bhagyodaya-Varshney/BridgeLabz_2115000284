import java.util.*;

public class SpringSeason{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        System.out.println((month >= 3 && month <= 6 && day >= 20 && day <= 31 ? "Its a Spring Season" : "Not a Spring Season"));
    }
}