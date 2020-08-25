
public class ReverseTheLL {
	public static ListNode reverseList(ListNode head) {
		if(head == null) return null;
        ListNode prev = null;
		ListNode curr = head;
		ListNode next = head;
		while(curr != null) {
			next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
		}
        return prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
