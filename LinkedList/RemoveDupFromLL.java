package LinkedList;

public class RemoveDupFromLL {

    Node removeDuplicates(Node head) {
        // code here
        if (head == null || head.next == null) {
            return head;
        }

        // using two pointer approach
        Node prev = head;
        Node curr = head.next;9

        while (curr != null) {

            if (curr.data != prev.data) {
                curr = curr.next;
                prev = prev.next;
            } else {
                prev.next = curr.next;
                curr = curr.next;
            }
        }
        return head;
    }
}
