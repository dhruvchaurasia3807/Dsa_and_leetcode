package java_collection_freamwork.Queue;
import java.util.Queue;
import java.util.LinkedList;

public class methods {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        System.out.println("Front: " + queue.peek());

        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue after removal: " + queue);

        System.out.println("Size: " + queue.size());
    }
}

// output:
// Queue: [10, 20, 30]
// Front: 10
// Removed: 10
// Queue after removal: [20, 30]
// Size: 2