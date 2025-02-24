import java.lang.reflect.*;

class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

public class InvokePrivateMethod {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);

        int res = (int) method.invoke(calc, 10, 10);
        System.out.println("Result: " + res);
    }
}
