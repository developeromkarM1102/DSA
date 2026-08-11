package LeetcodeQuestions;

public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        
        //pointing prev to null & curr to head
        ListNode prev = null;
        ListNode curr = head;

        //loop until curr is not eqaul to null
        while(curr!=null){

            //forward node
            ListNode forward = curr.next;
            //main logic
            //Point current node's next to previous node
            curr.next = prev;
            //updating prev
            prev = curr;
            //also updating curr
            curr = forward;
        }
        return prev;
    }
}
