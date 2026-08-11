
package LinkedList;

public class CircularLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // data members
    private Node head;
    private Node tail;
    private int size;

    CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void InsertAtHead(int data) {

        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;

            // Circular connection
            newNode.next = head;
        } 
        else {
            newNode.next = head;
            head = newNode;

            // Tail always points to head
            tail.next = head;
        }

        size++;
    }

    public void InsertAtTail(int data) {

        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;

            // Circular connection
            tail.next = head;
        } 
        else {
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    public void InsertAtPosition(int position, int data) {

        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            InsertAtHead(data);
            return;
        }

        if (position == size + 1) {
            InsertAtTail(data);
            return;
        }

        Node temp = head;

        // Reach node before required position
        for (int i = 1; i <= position - 2; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(data);

        // Main logic
        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    public void PrintList() {

        if (head == null) {
            System.out.println("CLL is empty.");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(head)");
    }

    public boolean Search(int target) {

        if (head == null) {
            return false;
        }

        Node temp = head;

        do {
            if (temp.data == target) {
                return true;
            }

            temp = temp.next;

        } while (temp != head);

        return false;
    }

    public void updatePosition(int position, int newData) {

        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        Node temp = head;

        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }

        temp.data = newData;
    }

    public void deleteHead() {

        if (head == null) {
            System.out.println("CLL is empty.");
            return;
        }

        // Only one node
        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        head = head.next;

        // Maintain circular connection
        tail.next = head;

        size--;
    }

    public void deleteTail() {

        if (head == null) {
            System.out.println("CLL is empty.");
            return;
        }

        // Only one node
        if (head == tail) {
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node temp = head;

        // Find node before tail
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;

        size--;
    }

    public void deleteAtPosition(int position) {

        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }

        if (position == 1) {
            deleteHead();
            return;
        }

        if (position == size) {
            deleteTail();
            return;
        }

        Node prevNode = head;

        // Reach node before required position
        for (int i = 1; i <= position - 2; i++) {
            prevNode = prevNode.next;
        }

        Node currNode = prevNode.next;

        prevNode.next = currNode.next;

        currNode.next = null;

        size--;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {

        CircularLinkedList myList = new CircularLinkedList();

        // Insert at head
        myList.InsertAtHead(10);
        myList.PrintList();

        // Insert at tail
        myList.InsertAtTail(100);
        myList.PrintList();

        // Insert at position
        myList.InsertAtPosition(2, 20);
        myList.PrintList();

        // Search
        System.out.println("Found or not : " + myList.Search(20));

        // Update
        myList.updatePosition(2, 50);
        myList.PrintList();

        // Delete head
        myList.deleteHead();
        myList.PrintList();

        // Delete tail
        myList.deleteTail();
        myList.PrintList();

        // Delete at position
        myList.deleteAtPosition(1);
        myList.PrintList();

        // Size
        System.out.println("Size : " + myList.getSize());
    }
}
