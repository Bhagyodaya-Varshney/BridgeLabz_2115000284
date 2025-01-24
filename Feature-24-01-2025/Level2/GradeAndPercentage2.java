import java.util.*;

public class GradeAndPercentage2{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
        int n = sc.nextInt();
		int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];
		
		for(int i=0;i<3;i++){
			System.out.print("Enter Physics Marks:");
			marks[i][0] = sc.nextInt();
			
			System.out.print("Enter Chemistry Marks:");
			marks[i][1] = sc.nextInt();
			
			System.out.print("Enter Maths Marks:");
			marks[i][2] = sc.nextInt();
			
			percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
			grade[i] = Grade(percentage[i]);
		}
		System.out.print("Marks, Percentage and Grades");
		for(int i=0;i<n;i++){
			System.out.println("Physics Marks:"+marks[i][0]+", Chemistry Marks:"+marks[i][1]+", Maths marks:"+marks[i][2]+" --> Percentage:"+percentage[i]+" and Grade is:"+grade[i]);
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