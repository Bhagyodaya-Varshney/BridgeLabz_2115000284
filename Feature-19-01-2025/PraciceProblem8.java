import java.util.*;
class PracticeProblem8{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base:");
		int base = sc.nextInt();
		System.out.print("Enter exponent:");
		int expo = sc.nextInt();
		System.out.println("Power of "+base+" is "+Math.pow(base,expo));
	}
}