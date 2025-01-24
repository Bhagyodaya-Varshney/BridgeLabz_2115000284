import java.util.*;

public class GradeAndPercentage{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
        int n = sc.nextInt();
		int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];
		
		for(int i=0;i<n;i++){
			System.out.print("Enter Physics Marks:");
			physics[i] = sc.nextInt();
			
			System.out.print("Enter Chemistry Marks:");
			chemistry[i] = sc.nextInt();
			
			System.out.print("Enter Maths Marks:");
			maths[i] = sc.nextInt();
			
			percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
			grade[i] = Grade(percentage[i]);
		}
		System.out.print("Marks, Percentage and Grades");
		for(int i=0;i<n;i++){
			System.out.println("Physics Marks:"+physics[i]+", Chemistry Marks:"+chemistry[i]+", Maths marks:"+maths[i]+" --> Percentage:"+percentage[i]+" and Grade is:"+grade[i]);
		}
	}
	private static char Grade(double percentage){
		if (percentage >= 80) return 'A';
        else if (percentage >= 70 && percentage <=79) return 'B';
        else if (percentage >= 60 && percentage <=69) return 'C';
        else if (percentage >= 50 && percentage <=59) return 'D';
        else if (percentage >= 40 && percentage <=49) return 'E';
        else return 'R';
	}
}