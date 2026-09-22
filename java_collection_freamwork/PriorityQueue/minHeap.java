package java_collection_freamwork.PriorityQueue;

import java.util.PriorityQueue;
public class minHeap {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

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
// Top: 5
// 5 10 20 30 40 