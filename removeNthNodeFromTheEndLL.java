
public class removeNthNodeFromTheEndLL {

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode tmpHead = head;
        ListNode curr = head;
        ListNode prev = head;
        while(n >= 0 && curr != null && curr.next != null) {
        	prev = curr;
        	curr = curr.next;
        	n--;
        }
        if(curr.next == null)
            prev.next = null;
        prev.next = curr.next;
        return tmpHead;
    }
	public static void main(String[] args) {
		
	}

}
