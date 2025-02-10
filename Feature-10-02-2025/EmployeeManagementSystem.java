import java.util.*;

class EmployeeManagementSystem{
	public static void main(String[]args){
		List<Employee> emp = new ArrayList<>();
		FullTimeEmployee emp1 = new FullTimeEmployee(100101, "Bhagyodaya", 30000, 10);
		PartTimeEmployee emp2 = new PartTimeEmployee(100105, "Kunal", 40000, 12);
		
		emp1.assignDepartment("IT");
		emp2.assignDepartment("HR");
		
		emp.add(emp1);
		emp.add(emp2);
		
		for(Employee employee : emp){
			employee.displayDetails();
			System.out.println("Total Salary: "+employee.calculateSalary());
			if(employee instanceof Department){
				System.out.println("Employee Department: "+((Department)employee).getDepartmentDetails());
				System.out.println();
			}
		}
	}
}
abstract class Employee{
	private int employeeId, baseSalary;
	private String name;
	Employee(int employeeId, String name, int baseSalary){
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	abstract int calculateSalary();
	public void displayDetails(){
		System.out.println("Employee Id: "+ employeeId);
		System.out.println("Employee Name: "+ name);
		System.out.println("Employee Base Salary: "+ baseSalary);
	}
	public int getBaseSalary(){
		return baseSalary;
	}
}
class FullTimeEmployee extends Employee implements Department{
	private int workHour;
	private String DepartmentName;
	FullTimeEmployee(int employeeId, String name, int baseSalary, int workHour){
		super(employeeId, name, baseSalary);		
		this.workHour = workHour;
	}
	@Override
	int calculateSalary(){
		int salary = getBaseSalary() * workHour;
		return salary;
	}
	public void assignDepartment(String DepartmentName){
		this.DepartmentName = DepartmentName;
	}
	public String getDepartmentDetails(){
		return DepartmentName;
	}

}
class PartTimeEmployee extends Employee implements Department{
	private int workHour;
	private String DepartmentName;
	PartTimeEmployee(int employeeId, String name, int baseSalary, int workHour){
		super(employeeId, name, baseSalary);		
		this.workHour = workHour;
	}
	@Override
	int calculateSalary(){
		int salary = getBaseSalary() * workHour;
		return salary;
	}
	public void assignDepartment(String DepartmentName){
		this.DepartmentName = DepartmentName;
	}
	public String getDepartmentDetails(){
		return DepartmentName;
	}
}

interface Department{
	void assignDepartment(String DepartmentName);
	String getDepartmentDetails();
}