// Using Linkedlist as a Queue

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>();

        // Adding elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        // Peek (view head)
        System.out.println("Front element: " + queue.peek());

        // Removing elements
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);
    }
}
