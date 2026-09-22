package java_collection_freamwork.PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;
public class maxHeap {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);
        pq.offer(40);

        System.out.println("Top: " + pq.peek());

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}

// output:
// Top: 40
// 40 30 20 10 5 