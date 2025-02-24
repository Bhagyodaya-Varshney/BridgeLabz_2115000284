import java.lang.reflect.*;

class Configuration {
    private static String APIKEY = "APIKEY123456789";
}

public class AccessAndModifyStaticFields {
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("APIKEY");
        field.setAccessible(true);

        System.out.println("Before: " + field.get(null));
        field.set(null, "APIKEY147258369");
        System.out.println("After: " + field.get(null));
    }
}
