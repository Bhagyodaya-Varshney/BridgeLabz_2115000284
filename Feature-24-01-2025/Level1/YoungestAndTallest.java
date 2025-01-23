import java.util.*;

public class YoungestAndTallest{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int[] age = new int[3];
		int[] height = new int[3];
		
		for(int i=0;i<3;i++){
			System.out.print("Enter the Age:");
			age[i] = sc.nextInt();
			System.out.print("Enter the Height");
			height[i] = sc.nextInt();
		}
		int youngest = age[0], tallest = height[0];
		
		for(int i=1;i<3;i++){
			if(age[i] < youngest)	youngest = age[i];
			if(height[i] > tallest)	tallest = height[i];
		}
		
		System.out.println("Youngest Friend is whoose age is "+youngest);
		System.out.println("Tallest Friend is whoose height is "+tallest);
	}
}