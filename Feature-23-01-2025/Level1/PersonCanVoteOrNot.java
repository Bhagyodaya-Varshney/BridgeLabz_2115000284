import java.util.*;
public class PersonCanVoteOrNot{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("The Person age is "+age+ (age >= 18 ? " and can vote" : " and cannot vote"));
    }
}