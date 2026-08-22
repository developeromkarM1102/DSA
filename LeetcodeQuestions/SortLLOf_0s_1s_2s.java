package LeetcodeQuestions;

import org.w3c.dom.Node;

public class SortLLOf_0s_1s_2s {

    public Node segregate(Node head) {
        // code here
        //creating dummy node separate all 3 nodes 
        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;
        
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;
        
        Node temp = head;
        
        //Breaking the List 
        while(temp != null){
            
            if(temp.data == 0){
                Node nodeToInsert = temp;
                temp = temp.next;
                zeroTail.next = nodeToInsert;
                zeroTail = nodeToInsert;
            }
            else if(temp.data == 1){
                Node nodeToInsert = temp;
                temp = temp.next;
                oneTail.next = nodeToInsert;
                oneTail = nodeToInsert;
            }
            else if(temp.data == 2){
                Node nodeToInsert = temp;
                temp = temp.next;
                twoTail.next = nodeToInsert;
                twoTail = nodeToInsert;
            }
        }
        
        //joining the link and deleting dummy head 
        zeroTail.next = (oneHead.next != null) ? oneHead.next : twoHead.next;
        oneTail.next = twoHead.next;
        twoTail.next = null;
        
        //returning the head of LL
        zeroHead = zeroHead.next;
        return zeroHead;
    }
}