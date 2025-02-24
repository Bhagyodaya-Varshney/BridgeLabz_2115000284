import java.lang.annotation.*;
import  java.lang.reflect.*;

@interface LogExecutionTime{}

public class LogExecutionTimeCustomAnnotation {
    @LogExecutionTime
    public static void fun1() {
        long start = System.nanoTime();
        long end = System.nanoTime();
        System.out.println("fun1 executed in " + (end - start) / 1e6 + " ms");
    }

    @LogExecutionTime
    public static void fun2() {
        long start = System.nanoTime();
        try {
            Thread.sleep(500); // Simulate slow execution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        System.out.println("fun2 executed in " + (end - start) / 1e6 + " ms");
    }
    public static void main(String[] args) {
        fun1();
        fun2();
    }
}
