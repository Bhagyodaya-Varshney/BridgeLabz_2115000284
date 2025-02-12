class StudentRecordManagement {
    public static void main(String[] args) {
        Student student = new Student(2115000284, "Bhagyodaya", 21, 'A');

        student = Student.addStudentAtBegining(2115000146, "SomeOne", 21, 'B', student);
        student = Student.addStudentAtBegining(2115000561, "Kunal", 21, 'A', student);
        student = Student.addStudentAtEnd(2115000125, "Anuj", 21, 'B', student);

        System.out.println("All student records:");
        Student.displayAllStudentRecords(student);

        System.out.println("Deleting student with Roll Number 2115000146");
        student = Student.deleteStudent(2115000146, student);
        Student.displayAllStudentRecords(student);

        System.out.println("Searching for student with Roll Number 2115000284");
        Student.searchStudent(2115000284, student);

        System.out.println("Updating grade of student with Roll Number 2115000284");
        Student.updateStudentRecord(2115000284, student, 'B');
        Student.displayAllStudentRecords(student);
    }
}

class Student {
    int rollNumber, age;
    String name;
    char grade;
    Student nextStudent;

    Student(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.nextStudent = null;
    }

    public static Student addStudentAtBegining(int rollNumber, String name, int age, char grade, Student student) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        newStudent.nextStudent = student;
        return newStudent;
    }

    public static Student addStudentAtEnd(int rollNumber, String name, int age, char grade, Student student) {
        Student newStudent = new Student(rollNumber, name, age, grade);

        if (student == null) 
            return newStudent;

        Student tempStudent = student;
        while (tempStudent.nextStudent != null)
            tempStudent = tempStudent.nextStudent;

        tempStudent.nextStudent = newStudent;
        return student;
    }

    public static Student deleteStudent(int rollNumber, Student student) {
        if (student == null)
            return null;

        if (student.rollNumber == rollNumber)
            return student.nextStudent;

        Student tempStudent = student;
        while (tempStudent.nextStudent != null && tempStudent.nextStudent.rollNumber != rollNumber)
            tempStudent = tempStudent.nextStudent;

        if (tempStudent.nextStudent != null)
            tempStudent.nextStudent = tempStudent.nextStudent.nextStudent;

        return student;
    }

    public static void searchStudent(int rollNumber, Student student) {
        while (student != null && student.rollNumber != rollNumber)
            student = student.nextStudent;

        if (student == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
            return;
        }

        System.out.println("Search Student Name: " + student.name);
        System.out.println("Student Roll Number: " + student.rollNumber);
        System.out.println("Student Age: " + student.age);
        System.out.println("Student Grade: " + student.grade);
        System.out.println();
    }

    public static void updateStudentRecord(int rollNumber, Student student, char updateGrade) {
        while (student != null && student.rollNumber != rollNumber)
            student = student.nextStudent;

        if (student == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found. Grade update failed.");
            return;
        }

        student.grade = updateGrade;
        System.out.println("Student Grade Updated.");
        System.out.println();
    }

    public static void displayAllStudentRecords(Student student) {
        while (student != null) {
            System.out.println("Student Name: " + student.name);
            System.out.println("Student Roll Number: " + student.rollNumber);
            System.out.println("Student Age: " + student.age);
            System.out.println("Student Grade: " + student.grade);
            System.out.println();
            student = student.nextStudent;
        }
        System.out.println();
    }
}
