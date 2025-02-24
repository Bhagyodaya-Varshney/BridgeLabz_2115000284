import java.lang.reflect.Field;

class Product {
    public String name = "Smartphone";
    public int price = 15500;
}

public class GenerateAJSON {
    public static String fun(Object obj) throws Exception {
        StringBuilder json = new StringBuilder("{");
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            json.append("\"").append(field.getName()).append("\": \"").append(field.get(obj)).append("\", ");
        }

        if (fields.length > 0) json.setLength(json.length() - 2); // Remove trailing comma
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        Product product = new Product();
        System.out.println(fun(product));
    }
}
