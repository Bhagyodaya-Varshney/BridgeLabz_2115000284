class SchoolSystemWithDifferentRoles{
	public static void main(String[]args){
		Teacher teacher = new Teacher("RP Singh", 25, "Physics");
        Student student = new Student("Kunal", 21, 'A');
        Staff staff = new Staff("Neeral", 40, "CEO");
		
		teacher.displayRole();
		student.displayRole();
		staff.displayRole();
	}
}
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("Role: General Person");
    }
}
class Teacher extends Person {
    private String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}

class Student extends Person {
    private char grade;

    Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student, Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff, Department: " + department);
    }
}