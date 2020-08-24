
public class HasCycle {
	public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode slow = head; // slow pointer
        ListNode fast = head.next; // fast
        while(slow != fast){
            // if fast reaches the end or fast next reaches end
            if(fast == null || fast.next == null)
                return false; // then no loop
            slow = slow.next;
            fast = fast.next.next;
        }
        // yes true
        return true;
    }
	
	
//	input
//	[3,2,0,-4]
//			1
}
