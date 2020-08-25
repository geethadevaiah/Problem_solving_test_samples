
public class IsPalindromeLL {
	public static boolean IsPalindrome(ListNode head) {
		
		if(head == null || head.next == null) return true;
		
		ListNode slow = head;
		ListNode fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode revHead = reverseList(slow);
		ListNode tmpHead = head;
		while(revHead.next != null && (revHead.val == tmpHead.val)) {
			revHead = revHead.next;
			tmpHead = tmpHead.next;
		}
		if(revHead.next == null)
			return true;
		return false;
	}
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
		ListNode list = new ListNode(1);
		list.next = new ListNode(0);
		list.next.next = new ListNode(0);
		list.next.next.next = new ListNode(1);
		System.out.println(IsPalindrome(list));
		
	}
}
// // Recursion
//class Solution {
//    ListNode node;
//    public boolean isPalindrome(ListNode head) {
//        node = head;
//        return palindrome(head);   
//    }
//    
//    public boolean palindrome(ListNode head){
//        if(head == null) return true;
//        
//        boolean pal = palindrome(head.next);
//        
//        if(pal == false) return false; //if at one point false , then keep returning false
//        
//        if(node.val == head.val){ //If the very end call stack is same as first
//            node = node.next;     // then current itteration is a palindrome
//            return true;
//        } 
//        return false;
//    }
//    
//}
