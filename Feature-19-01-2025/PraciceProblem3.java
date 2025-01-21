import java.util.*;
class PracticeProblem3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temperature in Celcius:");
		int tempearture = sc.nextInt();
		System.out.println("Temperature in Fahrenheit:"+(tempearture*9/5)+32);
	}
}