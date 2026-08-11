package LeetcodeQuestions;

public class ReverseLinkedList {

    /*{ Using Iteration

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
    }*/

    //using recursion

    public ListNode solve(ListNode prev, ListNode curr){

        if(curr == null){
            return prev;
        }
        ListNode forward = curr.next;
        curr.next = prev;
        prev = curr;
        curr = forward;

        ListNode ans = solve(prev, curr);
        return ans;
    }

    public ListNode reverseList(ListNode head){

        ListNode prev = null;
        ListNode curr = head;

        return solve(prev,curr);
    }
}
