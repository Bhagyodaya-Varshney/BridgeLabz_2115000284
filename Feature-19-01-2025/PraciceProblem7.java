import java.util.*;
class PracticeProblem7{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of Rectangle:");
		int len = sc.nextInt();
		System.out.print("Enter width of Rectangle:");
		int wid = sc.nextInt();
		System.out.println("Temperature in Fahrenheit:"+(len+wid)*2);
	}
}