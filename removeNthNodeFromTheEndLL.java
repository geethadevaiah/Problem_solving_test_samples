
public class removeNthNodeFromTheEndLL {

	public static ListNode removeNthFromEnd(ListNode head, int n) {
//		ListNode tmpHead = head;
//		ListNode A = head;
//		ListNode B = head;
//		// forward A node n times
//		while(A != null && n >= 0) {
//			A = A.next;
//			n--;
//		}
//		// move both A n B at same pace
//		while(A != null) {
//			A = A.next;
//			B = B.next;
//		}
//		B.next = B.next.next;
//		return tmpHead;
        
		 ListNode dummy = new ListNode(0);
		    dummy.next = head;
		    ListNode first = dummy;
		    ListNode second = dummy;
		    // Advances first pointer so that the gap between first and second is n nodes apart
		    for (int i = 1; i <= n + 1; i++) {
		        first = first.next;
		    }
		    // Move first to the end, maintaining the gap
		    while (first != null) {
		        first = first.next;
		        second = second.next;
		    }
		    second.next = second.next.next;
		    return dummy.next;
		
		
		
    }
	public static void main(String[] args) {
		
	}

}
