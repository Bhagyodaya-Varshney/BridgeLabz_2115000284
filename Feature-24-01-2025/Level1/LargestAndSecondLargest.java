import java.util.*;

public class LargestAndSecondLargest{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int num = sc.nextInt();
		int[] numArray = new int[10];
		int idx = 0;
		while(num != 0){
			if(idx==numArray.length){
				System.out.print("No More Input");
				break;
			}
			numArray[idx++] = num%10;
			num = num/10;
		}
		int largest = 0, secondLargest = 0;
		for(int i=0;i<numArray.length;i++){
			if(largest<numArray[i]){
				secondLargest = largest;
				largest = numArray[i];
			}
			else if(numArray[i] > secondLargest && largest > numArray[i]){
				secondLargest = numArray[i];
			}
		}
		
		System.out.println("Largest Digit is: "+largest);
		System.out.println("Second Largest Digit is: "+secondLargest);
		
	}
}