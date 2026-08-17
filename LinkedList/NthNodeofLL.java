package LinkedList;

public class NthNodeofLL {
    
	public int getKthFromLast(Node head, int k) {
		// code here
		
		if (head == null || k <= 0) {
			return - 1;
		}
		
		Node prev = head;
		Node curr = head;
		
		//using two pointer approach
		for (int i = 1; i <= k; i++) {
			if (curr == null) {
				return - 1;
			}
			curr = curr.next;
		}
		
		while (curr != null) {
			prev = prev.next;
			curr = curr.next;
		}
		
		int value = prev.data;
		return value;
	}
}
