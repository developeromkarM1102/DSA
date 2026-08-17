package LeetcodeQuestions;

public class RemNthNodeFromLL {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode prev = head;
        ListNode curr = head;

        for(int i=1;i<=n;i++){
            curr = curr.next;
        }

        if(curr == null){
            return head.next;
        }

        while(curr!=null){
            prev = prev.next;
            curr = curr.next;
        }

        //removing the N'th Node 
        prev.next = prev.next.next;

        return head;
    }
}
