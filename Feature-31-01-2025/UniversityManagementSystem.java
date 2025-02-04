public class Student{
    public int rollNumber;
    protected String name;
    private double cgpa;
    Student(int rollNumber, String name, double cgpa){
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }
    public double getCGPA(){
        return this.cgpa;
    }
    public void setCGPA(double cgpa){
        this.cgpa = cgpa;
    }

    public void modifyCGPA(double newCGPA){
        cgpa = newCGPA;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

public class PostgraduateStudent extends Student{
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }
        public void displayDetails() {
            System.out.println("Postgraduate Student:");
            System.out.println("Roll Number: " + rollNumber);  
            System.out.println("Name: " + name);      
        }
    
} 
public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student = new Student(2115000284, "Bhagyodaya", 7.7);
        student.displayDetails();
        student.setCGPA(7.8);
        System.out.println("Updated CGPA: " + student.getCGPA());
        PostgraduateStudent pgStudent = new PostgraduateStudent(2115000146, "SomeOne", 7.6);
        pgStudent.displayDetails();
    }
}
