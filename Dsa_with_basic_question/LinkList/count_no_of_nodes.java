package Dsa_with_basic_question.LinkList;

public class count_no_of_nodes {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next = second;
        second.next = third;
        third.next = fourth;

        int count = 0;
        Node temp = first;

        while(temp != null){
            count++;
            temp = temp.next;
           // System.out.print(temp.data+" ");
        }

        System.out.println("no of nodes : "+ count);
    }
}
