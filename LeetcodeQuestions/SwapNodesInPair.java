package LeetcodeQuestions;

public class SwapNodesInPair {

    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;

        while(prev.next != null && prev.next.next != null){

            //using TortoiseHare pattern 
            ListNode first = prev.next;
            ListNode second = first.next;

            //swap
            first.next = second.next;
            second.next = first;
            prev.next = second;

            //Move to next pair
            prev = first;
        }

        return dummy.next;
    }
}
