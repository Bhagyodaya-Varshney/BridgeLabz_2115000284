import java.lang.reflect.*;

class Person {
    private int age = 22;
}

public class AccessPrivateField {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Field field = Person.class.getDeclaredField("age");
        field.setAccessible(true);

        System.out.println("Before: " + field.get(person));
        field.set(person, 25);
        System.out.println("After: " + field.get(person));
    }
}
