package Dsa_with_basic_question.LinkList;
import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

}
public class addNewNodeFront {
    public static void main(String[] args) {
        //existing data
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        //cunnect node 
        first.next = second;
        second.next = third;

        //head
        Node head = first;

        //new node 
        Node newNode = new Node(5);

        //connect new node with old head
        newNode.next = head;

        //update head
        head = newNode;

        //print Linked List
        Node current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}

// output:
// 5
// 10
// 20
// 30