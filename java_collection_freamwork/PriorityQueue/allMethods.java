package java_collection_freamwork.PriorityQueue;
import java.util.PriorityQueue;
public class allMethods {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);

        System.out.println("Priority queue :  "+ pq);
        System.out.println("top : " +pq.peek());
        System.out.println("remmoved : "+pq.poll());
        System.out.println("top : " + pq.peek());
    }
}


// output:
// Priority queue :  [5, 10, 20, 30]
// top : 5
// remmoved : 5
// top : 10