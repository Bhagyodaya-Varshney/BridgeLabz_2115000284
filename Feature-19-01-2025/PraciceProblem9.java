import java.util.*;
class PracticeProblem9{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd Number:");
		int num2 = sc.nextInt();
		System.out.print("Enter 3rd Number:");
		int num3 = sc.nextInt();
		System.out.println("Average of Given Number is: "+(num1+num2+num3)/3);
	}
}