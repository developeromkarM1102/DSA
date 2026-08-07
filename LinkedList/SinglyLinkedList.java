package LinkedList;

public class SinglyLinkedList {

    //creating an node
    static class Node{
        //first block in node is data
        int data;
        //another block is storing add of that node
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    //constructor calling
    public SinglyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    //Insertion at Head of node
    public void InsertAtHead(int data) {
        
        //creating an newNode
        Node newNode = new Node(data);

        //if LinkedList is empty
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        //increase size because we add an new node
        size++;
    }

    public void InsertAtTail(int data){
        Node newNode = new Node(data);

        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = tail;
            tail = newNode;
        }
        size++;
    }
}
