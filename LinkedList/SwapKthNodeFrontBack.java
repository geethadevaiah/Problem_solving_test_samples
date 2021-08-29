package LinkedList;

public class SwapKthNodeFrontBack {

	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
        for (int i = 8; i >= 1; i--)
            llist.push(i);
 
        System.out.print("Original linked list: ");
        llist.printList();
        System.out.println("");
 
        for (int i = 1; i < 9; i++) {
            llist.swapKth(i);
            System.out.println("Modified List for k = " + i);
            llist.printList();
            System.out.println("");
        }
	}
	
}

class LinkedList {
	
	Node head ;
	public void push(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
	}
	
	public void printList() {
		Node node = head;
		while(node != null) {
			System.out.print(node.val+" ");
			node = node.next;
		}
		System.out.println("");
	}
	
	public int countNodes(){
		int count = 0;
		Node node = head;
		while(node !=  null) {
			count++;
			node = node.next;
		}
		return count;
	}
	
	public void swapKth(int k) {
		/**
		 *  k and n-k+1 -> from last node
		 * --- edge cases to handle
		 * 1. Y is next to X
		   2. X is next to Y
		   3. X and Y are same
		   4. X and Y don’t exist (k is more than number of nodes in linked list)
		 */
		int n = countNodes();
		
		if(k > n) return;
		
		// case 3
		if(2 * k - 1 == n) return;
					
		// find X
		Node X = head, prevX = null;
		for(int i = 1 ; i < k ; i++) {
			prevX = X;
			X = X.next;
		}
		Node Y = head, prevY = null;
		for(int i  = 1 ; i < n - k + 1 ; i++) {
			prevY = Y;
			Y = Y.next;
		}
		
		// if there exists prev_X then it points to Y
		if(prevX != null) {
			prevX.next = Y;
		}
		if(prevY != null) {
			prevY.next = X;
		}
		
		// exchange X and Y pointers
		Node tmp = X.next;
		X.next = Y.next;
		Y.next = tmp;
		
		// change the head pointer when k is 1 or n
		if(k == 1 ) head = Y;
		if(k == n ) head = X;
		
	}
}
