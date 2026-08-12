package LeetcodeQuestions;

public class MiddleOfLL {

    public ListNode middleNode(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;

        //TortoiseHare method -> move forward 2 step and slow 1 step
        while(fast!=null){
            fast = fast.next;
            if(fast!=null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow; 
    }
}
