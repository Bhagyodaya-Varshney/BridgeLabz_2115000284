import java.util.*;

public class BMI2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] Data = new double[n][3];
        String[] status = new String[n];
		
		for (int i = 0; i < n; i++) {
            System.out.print("Enter height(m):");
            Data[i][0] = sc.nextDouble();

            System.out.print("Enter weight(kg):");
            Data[i][1] = sc.nextDouble();

            Data[i][2] = Data[i][1] / (Data[i][0] * Data[i][0]);
            status[i] = Status(Data[i][2]);
        }
		
		System.out.println("Height-Weight-BMI-Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("Height:"+Data[i][0]+", Weight:"+Data[i][1]+"--> BMI:"+Data[i][2]+" Status:"+ status[i]);
        }
	}
	private static String Status(double bmi) {
        if (bmi < 18.4) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 39.9) return "Overweight";
        else return "Obese";
    }
}