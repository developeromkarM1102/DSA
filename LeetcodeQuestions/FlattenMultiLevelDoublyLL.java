package LeetcodeQuestions;

import org.w3c.dom.Node;

public class FlattenMultiLevelDoublyLL {

    public Node flatten(Node head) {
        
        // if LL is empty
        if(head == null){
            return head;
        }

        Node p = head;
        while(p != null){
            if(p.child == null){
                p = p.next;
            }
            else{
                Node temp = p.child;
                while(temp.next != null){
                    temp = temp = temp.next;
                }
                //Link Manipulation 
                temp.next = p.next; //last node of child point to next of p 
                if(p.next != null)
                    p.next.prev = temp; //prev of next node point to last node of child
                p.next = p.child; // now point p to child first node
                p.child.prev = p; // now point child prev node to p
                p.child = null; // tends child to null
            }
        }
        return head; // return final head of ans LL
    }
}
