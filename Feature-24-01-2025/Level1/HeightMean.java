import java.util.*;

public class HeightMean{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double[] heights = new double[11];
        double sum = 0.0;
		
		for(int i = 0; i < heights.length; i++) {
            System.out.print("Enter the height of player: ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;
        System.out.println("Heights Mean: " + mean);
	}
}