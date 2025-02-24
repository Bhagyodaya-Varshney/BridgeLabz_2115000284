import java.lang.reflect.*;

class Student {
    String name;

    public Student() {
        this.name = "ABC";
    }

    public void display() {
        System.out.println(name);
    }
}

public class DynamicallyCreateObj {
    public static void main(String[] args) throws Exception {
        Constructor<Student> constructor = Student.class.getDeclaredConstructor();
        Student student = constructor.newInstance();
        student.display();
    }
}
