import java.util.*;

public class CircularBuffer {
    int[] arr;
    int size, front, rear;

    public CircularBuffer(int capacity) {
        arr = new int[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }

    public void insert(int n) {
        if (size == arr.length) {
            front = (front + 1) % arr.length;
        } else {
            size++;
        }
        arr[rear] = n;
        rear = (rear + 1) % arr.length;
    }

    public List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(arr[(front + i) % arr.length]);
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        System.out.println(cb.getBuffer());
		cb.insert(4);
		System.out.println(cb.getBuffer());

    }
}
