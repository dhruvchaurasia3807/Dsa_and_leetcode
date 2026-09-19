package java_collection_freamwork.Stack;
import java.util.Stack;
public class createStack {
   public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    s.push(12);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    System.out.println(s);
   } 
}

// output:[12, 2, 3, 4, 5]