import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod{
    String level() default "HIGH";
}

class XYZ{
    @ImportantMethod
    public void fun1(){
        System.out.println("Hello World1!");
    }
    @ImportantMethod(level = "MEDIUM")
    public void fun2(){
        System.out.println("Hello World2!");
    }
}
public class ImportantMethodCustomAnnotation {
    public static void main(String[] args) throws Exception {
        Method[] m = XYZ.class.getMethods();
        for(Method method : m){
            if(method.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println(method.getName()+" "+annotation.level());
            }
        }
    }
}
