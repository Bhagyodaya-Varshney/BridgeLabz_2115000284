class EmployeeManagementSystem{
	public static void main(String[]args){
		Employee emp1 = new Employee("Bhagyodaya","SDE",2115000284);
		Employee emp2 = new Employee("Ayush","Developer",2115000285);
		
		emp1.displayDetails(emp1);
		emp2.displayDetails(emp2);
		
		Employee.displayTotalEmployee();
	}
}
class Employee{
	private static String companyName = "AppSquadz Pvt. Ltd.";
	private String name, designation;
	private final int id;
	private static int totalEmpolyee = 0;
	
	Employee(String name, String designation, int id){
		this.name = name;
		this.designation = designation;
		this.id = id;
		totalEmpolyee++;
	}
	public void displayDetails(Employee emp){
		if(emp instanceof Employee){
			System.out.println("Company Name is: "+company Name);
			System.out.println("Employee Name is: "+name);
			System.out.println("Employee Designation is: "+designation);
			System.out.println("Employee Id is: "+id);
		}
	}
	public static void displayTotalEmployee(){
		System.out.println("Total Number of Employees: "+totalEmployee);
	}
}