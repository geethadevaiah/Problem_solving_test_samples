package LinkedList;

public class FlattenTheNodes {
	
	public Node getLastNode(Node head) {
		if(head == null) {
			return null;
		}
		if(head.next == null) {
			return head;
		}
		return getLastNode(head.next);
	}

	public Node flatten(Node head) {
		if(head == null)
			 return null;
		// check for child nodes
		// add them and then traverse till end for next node
		Node curr = head;
		while(curr != null) {
			if(curr.child != null) {
				Node next = curr.next;
				Node child = flatten(curr.child); 
				
				curr.child = null;
				curr.next = child;
				child.prev = curr;
				
				while(curr.next != null)
					curr = curr.next;
				curr.next = next;
				
				if(next != null)
					next.prev = curr;
			}
			curr = curr.next;
		}
		return head;
	}
	

}
