class EmployeeManagementSystem{
	public static void main(String[]args){
		Employee manager = new Manager("Mr. Kunal Bhal", 1000101, 80000, 20);
        Employee developer = new Developer("Mr. Kunal Chaudhary", 1000110, 30000, "Java");
        Employee intern = new Intern("Mr. Ayush Srivastav", 1000113, 20000, 6);

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
	}
}
class Employee{
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee ID: " + id + ", Employee Name: " + name + ", Employee Salary: " + salary+" Rs.");
    }
}
class Manager extends Employee {
    private int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager, Team Size: " + teamSize);
    }
}
class Developer extends Employee {
    private String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer, Programming Language: " + programmingLanguage);
    }
}
class Intern extends Employee {
    private int internshipDuration;

    Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern, Internship Duration: " + internshipDuration + " months");
    }
}