package LeetcodeQuestions;

public class MergeNodeInBetZero {

    public ListNode mergeNodes(ListNode head) {
        
        ListNode read = head.next;
        ListNode write = head;

        while(read != null){
            //intiate sum 
            int sum = 0;
            //traverse and cal sum until hit node 0
            while(read.val != 0){
                sum += read.val;
                read = read.next;
            }

            //assigning sum value to write node
            write.val = sum;
            write.next = read.next;

            //moving to next one
            read = read.next;
            write = write.next;
        }
        return head;
    }
}
