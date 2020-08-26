package LinkedList;

public class DetectCycleReturnNode {
	public static ListNode detectCycle(ListNode head) {
		 if(head == null || head.next == null)
	            return null;
	        ListNode slow = head; // slow pointer
	        ListNode fast = head; // fast
	        ListNode tmp = head;
	        while(fast != null && fast.next != null){ 
	            slow = slow.next; 
	            fast = fast.next.next; 
	            if (slow == fast) { 
	            	 break;
	            } 
	        }
	        
	        if(fast == null || fast.next == null)
	        	return null;
	        
	        while(tmp != null && slow != null) {
	        	if(slow == tmp) return slow;
	        	slow =slow.next;
	        	tmp = tmp.next;
	        }
	        return null;
    }
	
	
	public static void main(String[] args) {
		//3,2,0,-4
//		ListNode l1 = new ListNode (3);
//		ListNode l2 = new ListNode (2);
//		ListNode l3 = new ListNode (0);
//		ListNode l4 = new ListNode (-4);
//		l1.next = l2;
//		l2.next = l3;
//		l3.next = l4;
//		l4.next = l2;
//		[-1,-7,7,-4,19,6,-9,-5,-2,-5]
//		9
		
		//[-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5]
		//24
		ListNode l1 = new ListNode (-1);
		ListNode l2 = new ListNode (-7);
		ListNode l3 = new ListNode (7);
		ListNode l4 = new ListNode (-4);
		ListNode l5 = new ListNode (19);
		ListNode l6 = new ListNode (6);
		ListNode l7 = new ListNode (-9);
		ListNode l8 = new ListNode (-5);
		ListNode l9 = new ListNode (-2);
		ListNode l10 = new ListNode (-5);
		
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		l8.next = l9;
		l9.next = l10;
		l10.next = l6;
		
		
		
		System.out.println(detectCycle(l1).val);
	}
}
