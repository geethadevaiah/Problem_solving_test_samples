package LinkedList;

public class AddTwoNumbersReverse {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
		int carry = 0;
		ListNode res = new ListNode(0);
		ListNode curr = res;
		while(l1 != null || l2 != null) {
            int val1 = l1!=null ? l1.val : 0;
            int val2 = l2!=null ? l2.val : 0;
			int num = carry + val1 + val2;
			res.next = new ListNode(num % 10);
			carry = num/10;
			res = res.next;
            l1 = l1!=null ? l1.next : null;
            l2 = l2!=null ? l2.next : null;
		}
		
		return curr.next;
    }
	public static void main(String[] args) {

	}

}
