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
        if (position == 1) {
            InsertAtHead(data);
            return;
        }
        if (position == size + 1) {
            InsertAtTail(data);
            return;
        }

        Node prevNode = head;

        // Move prevNode by position-2 to reach at the prevNode of destination
        for (int i = 1; i <= position - 2; i++) {
            prevNode = prevNode.next;
        }

        Node newNode = new Node(data);

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

    public boolean Search(int target){
        
        Node temp = head;
        while (temp != null) {
            if(temp.data == target){
                return true;
            }
            else{
                temp = temp.next;
            }
        }
        return false;
    }

    public void updatePosition(int position, int newData){
        if(position < 1 || position > size+1 ){
            return;
        }

        Node temp = head;

        for(int i=1;i<=position-1;i++){
            temp = temp.next;
        }

        temp.data = newData;
    }

    public boolean updateValue(int oldValue, int newValue){
        
        Node temp = head;
        while (temp!=null) {
            if(temp.data == oldValue){
                temp.data = newValue;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void deleteHead(){
        if(head == null){
            System.out.println("LL is empty so its cant be delete");
            return;
        }
        head = head.next;
        size--;

        if(head == null){
            tail = null;
        }
    }

    public void deleteTail(){
        if(head == null){
            System.out.println("LL is empty.");
            return;
        }

        if(head == tail){
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node temp = head;
        for(int i=1;i<size-2;i++){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;

        size--;
    }

    public void deleteAtPosition(int position){

        if(position < 1 || position > size+1 ){
            return;
        }

        if(position == 1){
            deleteHead();
            return;
        }

        if(position == size){
            deleteTail();
            return;
        }

        Node prev = head;

        for(int i=1;i<=position-2;i++){
            prev = prev.next;
        }

        Node curr = prev.next;
        Node forward = curr.next;

        //main logic
        prev.next = forward;
        curr.next = null;

        size--;
    }

    public boolean deleteValue(int target){
        if(head == null){
            System.out.println("Deletio  is not possible");
            return false;
        }

        if(head.data == target){
            deleteHead();
            return true;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
            if(curr.data == target){
                Node forward = curr.next;
                 prev.next = forward;
                 curr.next = null;

                 if(tail == null){
                    tail = prev;
                 }
                 size--;
                 return true;
            }
            else{
                prev = prev.next;
                curr = curr.next;
            }
        }
        return false;
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

        myList.InsertAtPosition(1, 50);
        myList.PrintList();

        myList.InsertAtPosition(8, 400);
        myList.PrintList();

        myList.InsertAtPosition(5, 80);
        myList.PrintList();

        System.out.println("Data at head : " + myList.getHead());
        System.out.println("Data at Tail : " + myList.getTail());
        System.out.println("Found or Not : " + myList.Search(200));

        myList.updatePosition(8, 45);
        myList.PrintList();

        System.out.println("update or not : " + myList.updateValue(45, 300));
        myList.PrintList();

        myList.deleteHead();
        myList.PrintList();

        myList.deleteAtPosition(3);
        myList.PrintList();

        myList.deleteValue(400);
        myList.PrintList();
    }
}
