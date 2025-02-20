import java.util.*;

public class ShoppingCart {
    private static Map<String,Integer> priceMap=new HashMap<>();
    private static Map<String,Integer> orderMap=new LinkedHashMap<>();
    private static Map<String,Integer> sortedMap=new TreeMap<>(Comparator.comparing(priceMap::get));

    public static void addItem(String item,int price) {
        priceMap.put(item,price);
        orderMap.put(item,price);
        sortedMap.put(item,price);
    }

    public static void displayHashMap() {
        System.out.println("HashMap:");
        priceMap.forEach((item,price)->System.out.println(item+":"+price));
    }

    public static void displayLinkedHashMap() {
        System.out.println("LinkedHashMap:");
        orderMap.forEach((item,price)->System.out.println(item+":"+price));
    }

    public static void displayTreeMap() {
        System.out.println("TreeMap:");
        sortedMap.forEach((item,price)->System.out.println(item+":"+price));
    }

    public static void main(String[] args) {
        addItem("SmartPhone",20000);
        addItem("SmartWatch",2000);
        addItem("Laptop",25000);

        displayHashMap();
        displayLinkedHashMap();
        displayTreeMap();
    }
}
