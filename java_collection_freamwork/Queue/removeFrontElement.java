package java_collection_freamwork.Queue;
import java.util.LinkedList;
import java.util.Queue;
public class removeFrontElement {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        int x = queue.poll();
        System.out.println("removed element = "+x);
    }
}

// output:removed element = 10