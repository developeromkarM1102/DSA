package LeetcodeQuestions;

public class ReverseLLInKGrp {

    public ListNode reverseKGroup(ListNode head, int k) {
        
        //Calculating Length
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        //check for unsatisfied condition
        if(len < k){
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        //Solving First k Group In LL
        for(int i=1;i<=k;i++){
            ListNode Forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Forward;
        }

        //Solve remening k groups using recursion
        ListNode RecursionAnsHead = reverseKGroup(curr, k);

        //Join First and Remening groupsi
        head.next = RecursionAnsHead;

        //Return Reversed K group LL
        return prev;
    }
}
