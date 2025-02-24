import java.lang.annotation.*;
import  java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
    int value();
}

class User {
    @MaxLength(15)  // Restrict username to a maximum of 10 characters
    private String username;

    public User(String username) {
        if (username.length() > 15) {
            throw new IllegalArgumentException("Username exceeds max length of 15 characters.");
        }
        this.username = username;
        System.out.println("User created successfully!");
    }
}

public class MaxLengthCustomAnnotation {
    public static void main(String[] args)throws Exception {
        User user1 = new User("Kunal");
        User user2 = new User("BhagyodayaVarshney");
    }
}
