package LinkedList;

public class DoublyLinkedList {
    
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    //data members
    private Node head;
    private Node tail;
    private int size;

    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void InsertAtHead(int data){

        Node newNode = new Node(data);

        if(head == null && tail == null){
            System.out.println("DLL is empty.");
            head = newNode;
            tail = newNode;
        }
        else{
            //main logic
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void InsertAtTail(int data){

        Node newNode = new Node(data);

        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    
    public void InsertAtPosition(int position, int data){
        if(position < 1 || position > size+1){
            System.out.println("Invalid case");
            return;
        }
        if(position == 1){
            InsertAtHead(data);
            return;
        }
        if(position == size+1){
            InsertAtTail(data);
            return;
        }

        Node temp = head;

        for(int i=1;i<=position-2;i++){
            temp = temp.next;
        }

        Node prevNode = temp;
        Node nextNode = prevNode.next;
        Node currNode = new Node(data);

        //main logic
        currNode.prev = prevNode;
        prevNode.next = currNode;
        currNode.next = nextNode;
        nextNode.prev = currNode;

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

    public void PrintBackword() {

        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.println();
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
    
    public void deleteHead(){
        if(head == null){
            System.out.println("LL is empty so its cant be delete");
            return;
        }
        head = head.next;
        head.prev = null;
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

        Node currNode = tail;
        Node prevNode = tail.prev;

        prevNode.next = null;
        currNode.prev = null;

        tail = prevNode;

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

        Node currNode = head;

        for(int i=1;i<=position-1;i++){
            currNode = currNode.next;
        }

        Node prevNode = currNode.prev;
        Node nextNode = currNode.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
        currNode.prev = null;
        currNode.next = null;

        size--;
    }

    //main method
    public static void main(String[] args) {

        DoublyLinkedList myList = new DoublyLinkedList();
        
        myList.InsertAtHead(10);
        myList.PrintList();

        myList.InsertAtTail(100);
        myList.PrintList();

        myList.InsertAtPosition(2,20);
        myList.PrintList();

        myList.PrintBackword();

        System.out.println("Found or not : " + myList.Search(20));

        myList.updatePosition(2, 50);
        myList.PrintList();

        myList.deleteHead();
        myList.PrintList();

        myList.deleteTail();
        myList.PrintList();

        myList.deleteAtPosition(1);
        myList.PrintList();
    }
}
