public class LinkedList {
    public static void main(String[] args) {
        System.out.println("Checking Working");

        // Creating a linked list
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Insert at beginning
        head = insertAtBegin(head, 5);

        // Display the list
        display(head);

        // Recursive display
        recursiveDisplay(head);
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Insert at the beginning (Static method for main)
    public static Node insertAtBegin(Node head, int x) {
        Node newHead = new Node(x);
        newHead.next = head;
        return newHead;
    }

    static void recursiveDisplay(Node head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        System.out.print(head.data + "->");
        recursiveDisplay(head.next);
    }
}

// Node class
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}
