import java.util.*;

class CustomHashMap<K, V> {
    private static final int SIZE = 16;
    private LinkedList<Node<K, V>>[] buckets = new LinkedList[SIZE];

    static class Node<K, V> {
        K key;
        V value;
        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    public void put(K key, V value) {
        int i = getIndex(key);
        if (buckets[i] == null) buckets[i] = new LinkedList<>();
        for (Node<K, V> n : buckets[i]) {
            if (n.key.equals(key)) {
                n.value = value;
                return;
            }
        }
        buckets[i].add(new Node<>(key, value));
    }

    public V get(K key) {
        int i = getIndex(key);
        if (buckets[i] != null) {
            for (Node<K, V> n : buckets[i]) {
                if (n.key.equals(key)) return n.value;
            }
        }
        return null;
    }

    public void remove(K key) {
        int i = getIndex(key);
        if (buckets[i] != null) buckets[i].removeIf(n -> n.key.equals(key));
    }

    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        System.out.println(map.get("a"));
        map.remove("a");
        System.out.println(map.get("a"));
    }
}
