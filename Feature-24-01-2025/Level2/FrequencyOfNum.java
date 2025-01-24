import java.util.*;

public class FrequencyOfNum{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n= sc.nextInt();

        int[] frequency = new int[10];
        while (n > 0) {
            int digit = n % 10;
            frequency[digit]++;
            n /= 10;
        }

        System.out.println("Digit\tFrequency");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + "\t" + frequency[i]);
            }
        }
	}
}