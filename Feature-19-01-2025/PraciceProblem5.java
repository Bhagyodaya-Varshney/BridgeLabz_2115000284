import java.util.*;
class PracticeProblem5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of Cylinder:");
		int radius = sc.nextInt();
		System.out.print("Enter Height of Cylinder:");
		int height = sc.nextInt();
		System.out.println("Volume of Cylinder:"+3.14*radius*radius*height);
	}
}