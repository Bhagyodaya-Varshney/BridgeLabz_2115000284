import java.lang.annotation.*;
import java.util.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {}

class AddTwoOperations{
    private static final HashMap<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int addTwo(int num) {
        if (cache.containsKey(num)) {
            System.out.println("Getting Result from Cache Memory: " + num);
            return cache.get(num);
        }

        System.out.println("Adding 2 to: " + num);
        int result = num + 2;
        cache.put(num, result);
        return result;
    }
}

public class CacheResultCustomAnnotation {
    public static void main(String[] args) {
        AddTwoOperations op = new AddTwoOperations();
        System.out.println("Result: " + op.addTwo(1));
        System.out.println("Result: " + op.addTwo(2));
        System.out.println("Result: " + op.addTwo(2));
    }
}
