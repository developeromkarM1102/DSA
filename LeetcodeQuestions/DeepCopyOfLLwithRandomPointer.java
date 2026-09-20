package LeetcodeQuestions;

import org.w3c.dom.Node;

public class DeepCopyOfLLwithRandomPointer {

    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        // 1. Create copied nodes and insert them after original nodes
        Node curr = head;

        while (curr != null) {

            Node copy = new Node(curr.val);

            copy.next = curr.next;
            curr.next = copy;

            curr = copy.next;
        }

        // 2. Set random pointers of copied nodes
        curr = head;

        while (curr != null) {

            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }

            curr = curr.next.next;
        }

        // 3. Separate the two lists
        curr = head;
        Node copyHead = head.next;

        while (curr != null) {

            Node copy = curr.next;

            curr.next = copy.next;

            if (copy.next != null) {
                copy.next = copy.next.next;
            }

            curr = curr.next;
        }

        return copyHead;
    }
}
