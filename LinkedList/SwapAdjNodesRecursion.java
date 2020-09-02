package LinkedList;

public class SwapAdjNodesRecursion {

	// swap the adjacent pairs 
	// Given 1->2->3->4, you should return the list as 2->1->4->3.
	// DO not modify the list values..
	public ListNode swapPairs(ListNode head) {
		if(head == null || head.next == null) {
			return head; // means either a single node is there.. not pair.. return the node
		}
		ListNode tmpHead = head.next;
		ListNode nxt = head.next.next;

		// make the second pointer to point to head.. (similar to reverse pointer)
		head.next.next = head;
		// let the next pointer be the swap nodes of the next set
		head.next = swapPairs(nxt);
		// return the head.next that is tmpHead node to return node of next recursion
		return tmpHead;
	}
}
