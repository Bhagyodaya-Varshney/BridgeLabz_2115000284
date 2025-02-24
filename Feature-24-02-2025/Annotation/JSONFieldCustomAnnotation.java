import java.lang.annotation.*;
import java.util.*;
import java.lang.reflect.Field;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField{
    String name();
}

class User1{
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public User1(String username, int age) {
        this.username = username;
        this.age = age;
    }
}

class JsonSerializer {
    public static String toJson(Object obj) throws IllegalAccessException {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            field.setAccessible(true);
            JsonField annotation = field.getAnnotation(JsonField.class);

            if (annotation != null) {
                if (!firstField) sb.append(",");
                sb.append("\"").append(annotation.name()).append("\":");

                Object value = field.get(obj);
                if (value instanceof String) {
                    sb.append("\"").append(value).append("\"");
                } else {
                    sb.append(value);
                }
                firstField = false;
            }
        }

        sb.append("}");
        return sb.toString();
    }
}

public class JSONFieldCustomAnnotation {
    public static void main(String[] args) throws IllegalAccessException {
        User1 user = new User1("Bhagyodaya", 22);
        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
