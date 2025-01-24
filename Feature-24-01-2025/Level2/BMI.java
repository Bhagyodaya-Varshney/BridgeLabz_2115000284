import java.util.*;

public class BMI{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
		
		for (int i = 0; i < n; i++) {
            System.out.print("Enter height(m):");
            height[i] = sc.nextDouble();

            System.out.print("Enter weight(kg):");
            weight[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);
            status[i] = Status(bmi[i]);
        }
		
		System.out.println("Height-Weight-BMI-Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("Height:"+height[i]+", Weight:"+ weight[i]+"--> BMI:"+bmi[i]+" Status:"+ status[i]);
        }
	}
	private static String Status(double bmi) {
        if (bmi < 18.4) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 39.9) return "Overweight";
        else return "Obese";
    }
}