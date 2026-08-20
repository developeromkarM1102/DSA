package LeetcodeQuestions;

public class Add1ToLL {

    public Node ReverseLL(Node head){
        Node prev = null;
        Node curr = head;
        
        while(curr != null){
            Node forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
    
    public Node addOne(Node head) {
        // code here.
        
        //step 1 : Reverse the original LL
        head = ReverseLL(head);
        //step 2 : main logic of 1 add
        Node curr = head;
        int carry = 1;
        
        while(curr != null){
            
            int nodeValue = curr.data;
            int sum = nodeValue + carry;
            int digit = sum % 10;
            
            curr.data = digit;
            
            carry = sum / 10;
            
            //exceptional case handle
            if(curr.next == null && carry > 0){
                curr.next = new Node (carry);
                carry = 0;
            }
            curr = curr.next;
        }
        //step 3 : reverse an modified LL
        head = ReverseLL(head);
        //step 4 : return the head of final LL
        return head;
    }
}
