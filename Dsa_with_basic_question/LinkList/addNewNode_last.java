package Dsa_with_basic_question.LinkList;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class addNewNode_last {

    public static void main(String[] args) {

        // Existing nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Connect nodes
        first.next = second;
        second.next = third;

        // Head
        Node head = first;

        // New node
        Node newNode = new Node(40);

        // Go to last node
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        // Connect new node
        current.next = newNode;

        // Print Linked List
        current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

// output:10 20 30 40 