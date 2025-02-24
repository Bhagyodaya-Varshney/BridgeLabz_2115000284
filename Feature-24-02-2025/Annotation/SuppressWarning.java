import java.util.*;

public class SuppressWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        System.out.println(list);
    }
}
