import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Author {
    String name();
}

@Author(name = "Bhagyodaya")
class MyClass{}

public class RetrieveAnnotationsAtRuntime {
    public static void main(String[] args) {
        Class<MyClass> obj = MyClass.class;
        if (obj.isAnnotationPresent(Author.class)) {
            Author author = obj.getAnnotation(Author.class);
            System.out.println(author.name());
        }
    }
}
