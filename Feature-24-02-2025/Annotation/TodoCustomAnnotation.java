import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo{
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
public class TodoCustomAnnotation {
    @Todo(task = "Print Hello", assignedTo = "fun1", priority = "HIGH")
    public static void fun1(){
        System.out.println("Hello");
    }
    @Todo(task = "Print World", assignedTo = "fun2")
    public static void fun2(){
        System.out.println("World");
    }
    @Todo(task = "Java", assignedTo = "fun3", priority = "LOW")
    public static void fun3(){
        System.out.println("Java");
    }
    public static void main(String[] args) {
        Method[] methods = TodoCustomAnnotation.class.getMethods();
        for(Method m : methods){
            if(m.isAnnotationPresent(Todo.class)){
                Todo todo = m.getAnnotation(Todo.class);
                System.out.println("Task: "+todo.task());
                System.out.println("Assigned To: "+todo.assignedTo());
                System.out.println("Priority: "+todo.priority());
            }
        }
    }
}
