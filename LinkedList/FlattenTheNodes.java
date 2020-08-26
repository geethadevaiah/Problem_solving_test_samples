package LinkedList;

public class FlattenTheNodes {
	
	public Node flatten(Node head) {
		if(head == null)
			 return null;
		// check for child nodes
		// add them and then traverse till end for next node
		Node curr = head;
		while(curr != null) {
			// if there is child
			if(curr.child != null) {
				// save the next nodes for later operations
				Node next = curr.next;
				// flatten the child nodes recursively
				Node child = flatten(curr.child); 
				
				// set the child nodes of curr to null
				curr.child = null;
				// set the next nodes of curr to child
				curr.next = child;
				// set the prev of child nodes to curr
				child.prev = curr;
				
				// traverse the curr to the end of the flattened child nodes
				while(curr.next != null)
					curr = curr.next;
				
				// set the next of the last flattened nodes to "next" saved nodes previously
				curr.next = next;
				// if the next nodes are not null then set the prev pointer to curr
				if(next != null)
					next.prev = curr;
			}
			// if nothing then increment the list pointer
			curr = curr.next;
		}
		// return the unaltered head node
		return head;
	}
	

}
