package java_collection_freamwork.Stack;
import java.util.Stack;
public class Stack_methods {
   public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
    //push
    s.push(12);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    //pop
    int x =s.pop();
    System.out.println(x);
    //peek
    int y =s.peek();
    System.out.println(y);
    //isEmpty
    System.out.println(s.isEmpty());
    //size
    System.out.println(s.size());

   } 
}

// output:
// 5
// 4
// false
// 4