import java.util.*;
public class PersonCanVoteOrNot{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int[] age = new int[10];

        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter the age of student: ");
            age[i] = sc.nextInt();
        }

        for (int i: age) {
            if (i< 0) {
                System.out.println("Invalid age: " + i);
            } else if (i >= 18) {
                System.out.println("The student with age " + i + " can vote.");
            } else {
                System.out.println("The student with age " + i + " cannot vote.");
            }
        }
	}
}