package LeetcodeQuestions;

import org.w3c.dom.Node;

public class Del_n_Nodes_after_m_Nodes {

    static Node linkDelete(Node head, int n, int m) {
        // code here
        Node prev = null;
        Node curr = head;
        
        while(curr != null){
            
            //ignore case
            for(int i=1;i<=m && curr!=null;i++){
                prev = curr;
                curr = curr.next;
            }
            
            if(curr == null){
                return head;
            }
            //delete case
            for(int i=1;i<=n && curr!=null;i++){
                curr = curr.next;
            }
            //Link rearrange
            prev.next = curr;
        }
        return head;
    }
}
