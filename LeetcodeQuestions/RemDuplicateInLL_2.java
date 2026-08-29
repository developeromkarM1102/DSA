package LeetcodeQuestions;

public class RemDuplicateInLL_2 {

    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            // duplicate found
            if (curr.next != null && curr.val == curr.next.val) {

                int duplicate = curr.val;

                // skip all nodes with same value
                while (curr != null && curr.val == duplicate) {
                    curr = curr.next;
                }

                // duplicates were at the beginning
                if (prev == null) {
                    head = curr;
                } else {
                    prev.next = curr;
                }

            } else {

                // current node is unique
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }
}