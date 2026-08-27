package LeetcodeQuestions;

public class PartitionLL {

    public ListNode partition(ListNode head, int x) {
        
        ListNode lesserHead = new ListNode(-1);
        ListNode lesserTail = lesserHead;

        ListNode greaterHead = new ListNode(-1);
        ListNode greaterTail = greaterHead;

        ListNode temp = head;

        while(temp != null){

            if(temp.val < x){
                
                //seperate all node and append to lesser LL
                ListNode NodeToInsert = temp;
                temp = temp.next;
                NodeToInsert.next = null;
                //Insert all tail in lesser LL
                lesserTail.next = NodeToInsert;
                lesserTail = NodeToInsert;
            }
            else{
                
                //seperate all node and append to greater LL
                ListNode NodeToInsert = temp;
                temp = temp.next;
                NodeToInsert.next = null;
                //Insert all tail in greater LL
                greaterTail.next = NodeToInsert;
                greaterTail = NodeToInsert;
            }
        }

        //merge sorted LL
        lesserTail.next = greaterHead.next;
        greaterTail.next = null;
        //removing dummy nodes
        lesserHead = lesserHead.next;

        return lesserHead;
    }
}
