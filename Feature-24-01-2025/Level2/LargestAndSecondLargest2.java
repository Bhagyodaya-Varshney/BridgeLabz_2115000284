import java.util.*;

public class LargestAndSecondLargest2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Num:");
		long n = sc.nextLong();
		
		int maxDigit = 10;
		int[] digit = new int[maxDigit];
		int idx = 0;
		
		while(n != 0){
			if(idx == maxDigit){
				maxDigit = maxDigit + 10;
				int[] temp = new int[maxDigit];
				System.arraycopy(digit,0,temp,0,digit.length);
				digit = temp;
			}
			digit[idx++] = (int)(n%10);
			n = n/10;
		}
		
		int Largest = Integer.MIN_VALUE;
		int SecondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<digit.length;i++){
			if (digit[i] > Largest) {
                SecondLargest = Largest;
                Largest = digit[i];
            } else if (digit[i] > SecondLargest && digit[i] != Largest) {
                SecondLargest = digit[i];
            }
		}
		
		System.out.print("Largest:"+Largest+", SecondLargest:"+SecondLargest);
	}
}