import java.util.*;
public class StoreMultipleValues{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double[] number = new double[10];
        double total = 0.0;
		int idx = 0;
		
		while (true) {
            System.out.print("Enter Number: ");
            double input = sc.nextDouble();
            if (input <= 0 || idx == 10) break;

            number[idx++] = input;
        }
		for (int i = 0; i < idx; i++) total += number[i];
		System.out.println("Total Sum: " + total);
	}
}