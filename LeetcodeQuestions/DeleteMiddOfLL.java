package LeetcodeQuestions;

public class DeleteMiddOfLL {

    public ListNode deleteMiddle(ListNode head) {
        
        //main logic is not to delete the mid instead find prev node of mid and link it to next node of mid
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {

            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;

        return head;
    }
}
