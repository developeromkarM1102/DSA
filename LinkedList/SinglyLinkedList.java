package LinkedList;

public class SinglyLinkedList {

    // creating an node
    static class Node {
        // first block in node is data
        int data;
        // another block is storing add of that node
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    // constructor calling
    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Insertion at Head of node
    public void InsertAtHead(int data) {

        // creating an newNode
        Node newNode = new Node(data);

        // if LinkedList is empty
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        // increase size because we add an new node
        size++;
    }

    public void InsertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void InsertAtPosition(int position, int data) {

        if (position < 1 || position > size + 1) {
            System.out.println("Insertion is not possible");
            return;
        }
        if (position > 1) {
            InsertAtHead(data);
            return;
        }
        if (position == size + 1) {
            InsertAtTail(data);
            return;
        }

        Node prevNode = head;

        // Move prevNode by position-2 to reach at the prevNode of destination
        for (int i = 1; i < position - 2; i++) {
            prevNode = prevNode.next;
        }

        Node newNode = prevNode.next;

        // update links
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        // increase size
        size++;
    }

    public void PrintList() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getHead() {
        if (head == null) {
            return -1;
        } else {
            return head.data;
        }
    }

    public int getTail() {
        if (tail == null) {
            return -1;
        } else {
            return tail.data;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();

        if (myList.isEmpty()) {
            System.out.println("List is empty");
        }

        System.out.println("Size of an LL : " + myList.size);

        myList.InsertAtHead(10);
        myList.PrintList();

        myList.InsertAtHead(20);
        myList.PrintList();

        myList.InsertAtHead(30);
        myList.PrintList();

        myList.InsertAtTail(100);
        myList.PrintList();

        myList.InsertAtTail(200);
        myList.PrintList();

        myList.InsertAtTail(300);
        myList.PrintList();
    }
}
