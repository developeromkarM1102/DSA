package LeetcodeQuestions;

public class DoubleNumberInLL {

    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public ListNode doubleIt(ListNode head) {

        // Reverse LL
        head = reverse(head);

        ListNode temp = head;
        ListNode prev = null;
        int carry = 0;

        while (temp != null) {

            int sum = temp.val * 2 + carry;

            temp.val = sum % 10;
            carry = sum / 10;

            prev = temp;
            temp = temp.next;
        }

        // Add remaining carry at the end
        if (carry != 0) {
            prev.next = new ListNode(carry);
        }

        // Restore original order
        return reverse(head);
    }
}
