package LeetcodeQuestions;

public class PalindromeLL {

    public ListNode getMidOfLL(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }

    public ListNode ReverseLL(ListNode head) {

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

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }
        //find the mid
        ListNode list2 = getMidOfLL(head);

        //separate list1 and list2
        ListNode temp = head;

        while (temp.next != list2) {
            temp = temp.next;
        }
        temp.next = null;

        //reverse list
        ListNode head2 = ReverseLL(list2);

        //compare the reverse list
        ListNode temp1 = head;
        ListNode temp2 = head2;

        while (temp1 != null && temp2 != null) {

            if (temp1.val != temp2.val) {
                return false;
            } else {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        //return 
        return true;
    }
}
