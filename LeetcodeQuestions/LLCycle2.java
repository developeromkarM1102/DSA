package LeetcodeQuestions;

public class LLCycle2 {

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        //Detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            //Detect cycle starting point
            if (slow == fast) {

                slow = head;

                while (fast != slow) {

                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
