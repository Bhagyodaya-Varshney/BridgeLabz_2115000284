import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

class Service {
    void execute() {
        System.out.println("Executed.");
    }
}

class Client {
    @Inject
    private Service service;

    void run() {
        service.execute();
    }
}

class DIContainer {
    public static void injectDependencies(Object obj) throws Exception {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                field.set(obj, field.getType().getDeclaredConstructor().newInstance());
            }
        }
    }
}

public class DependencyInjection {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        DIContainer.injectDependencies(client);
        client.run();
    }
}
