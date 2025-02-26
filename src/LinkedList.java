public class LinkedList {
    public static void main(String[] args) {
        System.out.println("Checking Wroking");
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        display(head);

    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}


class Node{
        int data;
        Node next;
        Node(int x){
            data=x;
            next=null;
        }
}
