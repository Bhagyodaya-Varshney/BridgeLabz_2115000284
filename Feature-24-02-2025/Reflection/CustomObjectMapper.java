import java.lang.reflect.Field;
import java.util.*;

class User {
    public String name;
    public int age;
}

public class CustomObjectMapper {
    public static <T> T fun(Class<T> clazz, HashMap<String, Object> hm) throws Exception {
        T obj = clazz.getDeclaredConstructor().newInstance();
        for (Map.Entry<String, Object> entry : hm.entrySet()) {
            Field field = clazz.getDeclaredField(entry.getKey());
            field.setAccessible(true);
            field.set(obj, entry.getValue());
        }
        return obj;
    }
    public static void main(String[] args) throws Exception {
        HashMap<String, Object> hm = new HashMap<>();
        hm.put("name","Bhagyodaya");
        hm.put("age",22);
        User user = fun(User.class, hm);
        System.out.println(user.name + " - " + user.age);
    }
}
