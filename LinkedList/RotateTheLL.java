package LinkedList;

public class RotateTheLL {
	public ListNode rotateRight(ListNode head, int k) {
        if(head == null ) return null;
        if(head.next == null) return head;
        if(k == 0) return head;
        ListNode tmpHead = head;
        ListNode curr = head;
        ListNode prev = null;
        int len = getLengthOfLL(head);
        if(k > len)
        	k = k % len;
        k = len - k;
        if(k == 0) return head;
        while(curr != null && k > 0) {
        	prev = curr;
        	curr = curr.next;
        	k--;
        }
        /*if(k > 0) {
        	k = k % getLengthOfLL(head);
        	curr = head;
        	while(curr != null && k > 0) {
        		prev = curr;
            	curr = curr.next; k--;
        	}
        }*/
        if(curr == null) return head;
        // make curr head & prev.next null n join the links
        if(prev != null) prev.next = null;
        head = curr;
        while(curr != null) {
        	prev = curr;
        	curr = curr.next;
        }
        prev.next = tmpHead;
        return head;
    }
	
	public static int getLengthOfLL(ListNode node) {
		ListNode curr = node;
		int count = 0;
		while(curr != null) {
			count++;
			curr= curr.next;
		}
		return count;
	}
}
