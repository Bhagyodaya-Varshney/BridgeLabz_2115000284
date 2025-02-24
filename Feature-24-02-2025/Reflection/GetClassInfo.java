import java.lang.reflect.*;

public class GetClassInfo {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("java.util.Scanner");

        System.out.println("Methods:");
        for (Method method : cls.getDeclaredMethods())
            System.out.println(method);

        System.out.println("Fields:");
        for (Field field : cls.getDeclaredFields())
            System.out.println(field);

        System.out.println("Constructors:");
        for (Constructor<?> constructor : cls.getDeclaredConstructors())
            System.out.println(constructor);
    }
}
