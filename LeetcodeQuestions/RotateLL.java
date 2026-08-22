package LeetcodeQuestions;

public class RotateLL {

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || k == 0) {
            return head;
        }

        //main logic : make it circular and break it using k valuer
        int len = 1; 
        ListNode temp = head;

        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        //making it circular
        temp.next = head;

        //update the K
        k = k % len;

        //Link break and set forward variable
        temp = head;

        for (int i = 1; i <= len - k - 1; i++) {
            temp = temp.next;
        }

        ListNode forward = temp.next;

        //Link break
        temp.next = null;

        //return head of an modified LL
        return forward;
    }
}
