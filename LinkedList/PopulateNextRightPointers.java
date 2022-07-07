package LinkedList;

public class PopulateNextRightPointers {

	
	public Node connect(Node root) {
		
		Node pre = root, curr = null;
		while(pre != null) {
			curr = pre;
			while(curr != null) {
				
				if(curr.left != null) curr.left.next = curr.right;
				if(curr.right != null && curr.next != null) curr.right.next = curr.next.left;
				curr = curr.next; //keep traversing the "next"
			}
			pre = pre.left; // keep going left.. because by going left u r moving to the right(inner loop)!
		}
		
		return root;
	}
	
	class Node {
	    public int val;
	    public Node left;
	    public Node right;
	    public Node next;

	    public Node() {}
	    
	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val, Node _left, Node _right, Node _next) {
	        val = _val;
	        left = _left;
	        right = _right;
	        next = _next;
	    }
	};
}
