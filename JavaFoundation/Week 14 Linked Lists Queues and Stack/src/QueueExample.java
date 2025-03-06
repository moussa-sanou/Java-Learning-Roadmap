import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(10); // Throws exception if full
        queue.offer(20); // Returns false if full (safer)
        System.out.println(queue);
        System.out.println("----------------------------------");

        // Dequeue elements
        int first = queue.remove(); // Throws exception if empty
        System.out.println(queue);
        System.out.println("----------------------------------");

        int second = queue.poll(); // Returns null if empty
        System.out.println(queue);
        System.out.println("----------------------------------");

        // Peek at the front element
        int front = queue.peek();
        System.out.println(queue);

    }
}
