import java.util.*;
public class EmpBonus{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		double[] salary = new double[10];
		double[] yearOfService = new double[10];
		double[] bonus = new double[10];
		double[] newSalary = new double[10];
		
		double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
		
		for(int i=0;i<10;i++){
			System.out.print("Enter Salary:");
			salary[i] = sc.nextDouble();
			System.out.print("Enter Year of Services:");
			yearOfService[i] = sc.nextDouble();
			
			if(salary[i]<=0 || yearOfService[i]<=0){
				i--;
				System.out.print("Enter a Valid Details");
				continue;
			}
			
			bonus[i] = yearOfService[i] > 5 ? salary[i]*0.05 : salary[i]*0.02;
			newSalary[i] = bonus[i] + salary[i];
			
			totalBonus = totalBonus + bonus[i];
			totalOldSalary = totalOldSalary + salary[i];
			totalNewSalary = totalNewSalary + newSalary[i];
		}
		
		System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
	}
}