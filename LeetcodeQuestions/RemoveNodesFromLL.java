package LeetcodeQuestions;

public class RemoveNodesFromLL {

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

    public ListNode removeNodes(ListNode head) {

        // Reverse the Linked List so we can process nodes from right to left
        head = reverse(head);

        // Store the maximum value seen so far
        int max = Integer.MIN_VALUE;

        // Pointer used to traverse the reversed Linked List
        ListNode curr = head;

        // Head of the new Linked List containing valid nodes
        ListNode newHead = null;

        // Tail pointer to add nodes at the end of the new Linked List
        ListNode tail = null;

        while (curr != null) {

            // Keep the node if its value is greater than or equal to
            // the maximum value seen so far
            if (curr.val >= max) {

                // Update the maximum value
                max = curr.val;

                // If this is the first valid node, make it the new head
                if (newHead == null) {
                    newHead = curr;
                    tail = curr;
                } else {

                    // Attach the current valid node to the end
                    tail.next = curr;

                    // Move tail to the newly added node
                    tail = curr;
                }
            }

            // Move to the next node
            curr = curr.next;
        }

        // Mark the end of the new Linked List
        tail.next = null;

        // Reverse again to restore the original order
        return reverse(newHead);
    }

}
