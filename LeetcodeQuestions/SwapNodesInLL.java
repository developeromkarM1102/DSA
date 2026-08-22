package LeetcodeQuestions;

public class SwapNodesInLL {

    public ListNode swapNodes(ListNode head, int k) {

        // Find the kth node from the beginning
        ListNode first = head;

        for (int i = 1; i <= (k - 1); i++) {
            first = first.next;
        }

        // Use a temporary pointer to find the kth node from the end
        ListNode temp = first.next;
        ListNode second = head;

        while (temp != null) {
            temp = temp.next;
            second = second.next;
        }

        // Swap the values of the kth node from the beginning
        // and the kth node from the end
        int tempValue = first.val;
        first.val = second.val;
        second.val = tempValue;

        return head;
    }
}
