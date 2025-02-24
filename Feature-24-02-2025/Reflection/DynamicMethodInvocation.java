import java.lang.reflect.*;
import java.util.*;

class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter method name (add/subtract/multiply): ");
        String name = sc.nextLine();

        System.out.println("Num1: ");
        int num1 = sc.nextInt();

        System.out.println("Num2: ");
        int num2 = sc.nextInt();

        Method method = MathOperations.class.getMethod(name, int.class, int.class);
        MathOperations obj = new MathOperations();

        Object res = method.invoke(obj, num1, num2);
        System.out.println("Result: " + res);
    }
}
