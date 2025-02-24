import java.lang.reflect.Method;

class Task {
    public void fun() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void fun2() {
        System.out.println("fun2 executed.");
    }
}
public class MethodExecutionTiming {
    public static void measureExecutionTime(Object obj, String methodName) throws Exception {
        Method method = obj.getClass().getMethod(methodName);
        long start = System.nanoTime();
        method.invoke(obj);
        long end = System.nanoTime();
        System.out.println("Execution Time: " + (end - start) / 1e6 + " ms");
    }

    public static void main(String[] args) throws Exception {
        Task task = new Task();
        measureExecutionTime(task, "fun2");
        measureExecutionTime(task, "fun");
    }
}
