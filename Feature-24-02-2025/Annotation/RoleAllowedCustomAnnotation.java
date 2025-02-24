import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface RoleAllowed {
    String value();
}

@RoleAllowed(value = "ADMIN")
class UserRoles{

    public void adminFun(){
        System.out.println("ACCESS ACCEPTED");
    }
    public void normalFun(){
        System.out.println("Normal Task");
    }
}

public class RoleAllowedCustomAnnotation {
    static final String currentRole = "USER";
    public static void executeIfAllowed(Object obj, String methodName) throws Exception {
        if (obj.getClass().isAnnotationPresent(RoleAllowed.class)) {
            String requiredRole = obj.getClass().getAnnotation(RoleAllowed.class).value();

            if (!currentRole.equals(requiredRole)) {
                System.out.println("ACCESS DENIED");
                return;
            }
        }

        Method method = obj.getClass().getMethod(methodName);
        method.invoke(obj);
    }
    public static void main(String[] args) throws Exception {
        UserRoles roles = new UserRoles();
        executeIfAllowed(roles, "adminFun");
        executeIfAllowed(roles, "normalFun");
    }
}
