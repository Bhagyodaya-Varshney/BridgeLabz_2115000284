class CircularQueue {
    Node front, rear;

    CircularQueue() {
        front = rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            rear.next = front;
        } else {
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
    }

    public int dequeue() {
        if (front == null) return -1;

        int value = front.data;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front;
        }
        return value;
    }

    public int front() {
        return (front != null) ? front.data : -1;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue());
        System.out.println(queue.front());
    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
            this.data = data;
            this.next = null;
    }
}