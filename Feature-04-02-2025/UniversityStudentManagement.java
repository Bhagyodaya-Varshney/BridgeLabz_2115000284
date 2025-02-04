class UniversityStudentManagement{
	public static void main(String[]args){
		Student student1 = new Student("Bhagyodaya",2115000284,'A');
		Student student2 = new Student("Ayush",2115000285,'B');
		
		student1.displayDetails(student1);
		student2.displayDetails(student2);
		
		student1.updatingGrades('C');
		
		student1.displayDetails(student1);
	}
}
class Student{
	private static String universityName = "GLA University";
	private String name;
	private final int rollNumber;
	private char grade;
	private static int totalStudents = 0;
	
	Student(String name, int rollNumber, char grade){
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
		totalStudents++;
	}
	public void displayDetails(Student student){
		if(student instanceof Student){
			System.out.println("University Name: " + universityName);
			System.out.println("Student Name: " + name);
            System.out.println("Student Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
		}
	}
	public void updatingGrades(char newGrade){
		this.grade = newGrade;
	}
	public static void displayTotalStudents(){
		System.out.println("Total Students are: "+totalStudents);
	}
}