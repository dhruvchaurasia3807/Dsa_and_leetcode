package java_collection_freamwork.PriorityQueue;
import java.util.PriorityQueue;
public class print_elementsOneByOne {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq  = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);
        
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}

// output:
// 5
// 10
// 20
// 30