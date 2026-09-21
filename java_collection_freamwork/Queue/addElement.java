package java_collection_freamwork.Queue;
import java.util.LinkedList;
import java.util.Queue;
public class addElement {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println(queue);
    }
}

// output:[10, 20, 30]