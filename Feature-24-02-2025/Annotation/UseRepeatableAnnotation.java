import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ManyBugReport.class)
@interface BugReport{
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ManyBugReport{
    BugReport[] value();
}

class ABC{
    @BugReport(description = "Bug 1 Arise")
    @BugReport(description = "Bug 2 Arise")
    public void fun(){
        System.out.println("Process");
    }
}
public class UseRepeatableAnnotation {
    public static void main(String[] args) throws Exception{
        Method m = ABC.class.getMethod("fun");
        BugReport[] bugs = m.getAnnotationsByType(BugReport.class);
        for (BugReport bug : bugs){
            System.out.println("Bug: " + bug.description());
        }
    }
}
