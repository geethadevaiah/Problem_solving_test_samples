package LinkedList;

import java.util.PriorityQueue;

public class MergeksortedLists {
	
	// Priority Queue method
	public static ListNode mergeList(ListNode[] list) {
		// priiority queue is used for minHeap 
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(ListNode head :list) {
			while(head !=  null) {
				minHeap.add(head.val);
				head = head.next;
			}
		}
		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
		while(!minHeap.isEmpty()) {// Get each min val from the heap
			head.next = new ListNode(minHeap.remove());
			head = head.next;
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(5);
		ListNode l4 = new ListNode(7);
		
		l1.next = l2;
		l1.next.next = l3;
		l1.next.next.next = l4;
		
		ListNode l5 = new ListNode(1);
		ListNode l6 = new ListNode(3);
		ListNode l7 = new ListNode(9);
		
		l5.next = l6;
		l5.next.next = l7;
		
		ListNode[] list = {l1, l5};
		
		System.out.println(mergeList(list));
		
	}
	
}
