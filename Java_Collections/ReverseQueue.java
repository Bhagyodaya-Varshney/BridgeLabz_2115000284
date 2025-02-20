import java.util.*;

public class ReverseQueue{
	public static Queue<Integer> reverseQueue(Queue<Integer> queue){
        if(queue.isEmpty()) return queue;
		
        int front=queue.remove();
        reverseQueue(queue);
        queue.add(front);
		
		return queue;
    }
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>(Arrays.asList(10,20,30));
        System.out.println(reverseQueue(queue));
    }
}
