import java.util.*;
class PracticeProblem6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principle Amt:");
		int amt = sc.nextInt();
		System.out.print("Enter Interest Rate:");
		int rate = sc.nextInt();
		System.out.print("Enter Time Period:");
		int time = sc.nextInt();
		System.out.println("Simple Interes:"+(amt*rate*time)/100);
	}
}