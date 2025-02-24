import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo{
    String priority();
    String assignedTo();
}

class TaskManager{
    @TaskInfo(priority = "High", assignedTo = "Bhagyodaya")
    public void completeTask(){
        System.out.println("Task Done");
    }
}
public class CustomAnnotations {
    public static void main(String[] args)  throws Exception {
        Method m = TaskManager.class.getMethod("completeTask");
        TaskInfo info = m.getAnnotation(TaskInfo.class);
        if (info != null) {
            System.out.println("Priority: " + info.priority());
            System.out.println("Assigned To: " + info.assignedTo());
        }
    }
}
