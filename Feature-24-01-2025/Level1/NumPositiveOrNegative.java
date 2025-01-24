import java.util.*;
public class NumPositiveOrNegative{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int[] number = new int[5];

        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter number: ");
            number[i] = sc.nextInt();
        }
		for (int num : number) {
            if (num > 0) System.out.println(num + " is positive and " + (num % 2 == 0 ? "even" : "odd"));
			else if (num < 0) System.out.println(num + " is negative");
            else System.out.println("Zero");
        }
		if (number[0] > number[number.length - 1]) System.out.println("First element is greater than the last element.");
		else if (number[0] < number[number.length - 1]) System.out.println("First element is less than the last element.");
        else System.out.println("First and last elements are equal.");
	}
}