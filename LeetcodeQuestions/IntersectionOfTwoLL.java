package LeetcodeQuestions;

public class IntersectionOfTwoLL {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA == null || headB == null){
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while(a != null && b != null){
            a = a.next;
            b = b.next;
        }

        //if both LL is not of same Length 
        if(a == null){
            int bExtraLen = 0;
            while(b != null){
                bExtraLen++;
                b = b.next;
            }
            while(bExtraLen-- > 0){
                headB = headB.next;
            }
        }
        else{
            int aExtraLen = 0;
            while(a != null){
                aExtraLen++;
                a = a.next;
            }
            while(aExtraLen-- > 0){
                headA = headA.next;
            }
        }

        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}

