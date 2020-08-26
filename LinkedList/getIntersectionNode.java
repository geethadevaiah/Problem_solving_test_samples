package LinkedList;

public class getIntersectionNode {

	public static ListNode gettheIntersectionNode(ListNode headA, ListNode headB) {
		
		int countA = getCountLinkNodes(headA);
		int countB = getCountLinkNodes(headB);
		if(countA >= countB)
			return getIntersectionLinkNode(countA-countB, headA, headB);
		else
			return getIntersectionLinkNode(countB-countA, headB, headA);
		
    }
	
	public static ListNode getIntersectionLinkNode(int c, ListNode A, ListNode B) {
		ListNode currA = A;
		ListNode currB = B;
		while( c > 0 ) {
			currA = currA.next;
			c--;
		}
		
		while(currA != null && currB != null) {
			if(currA == currB)
				return currA;
			currA = currA.next;
			currB = currB.next;
		}
		return null;
	}
	
	public static int getCountLinkNodes(ListNode node) {
		int count = 0;
		while(node != null) {
			node = node.next;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
        // creating first linked list 
		ListNode list = new ListNode(3); 
        list.next = new ListNode(6); 
        list.next.next = new ListNode(9); 
        list.next.next.next = new ListNode(15); 
        list.next.next.next.next = new ListNode(30); 
  
        // creating second linked list 
        ListNode list1 = new ListNode(3); 
        list1.next = new ListNode(10); 
        list1.next.next = list.next.next.next;//new ListNode(15); 
        //list1.next.next.next = new ListNode(30); 
  
        System.out.println("The node of intersection is " + gettheIntersectionNode(list, list1).val); 
	}

}
