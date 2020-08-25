
public class MergeTwoLL {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode mergedList = new ListNode(0);
		ListNode curr = mergedList;
		while(l1 != null && l2 != null) {
			if(l1.val <= l2.val) {
				mergedList.next = l1;
				l1 = l1.next;
			}
			else{
				mergedList.next = l2;
				l2 = l2.next;
			}
			mergedList = mergedList.next;
		}
		if(l1 != null) {
			mergedList.next = l1;
		}
		if(l2 != null) {
			mergedList.next = l2;
		}
	    return curr.next;    
	}
	public static void main(String[] args) {
		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);
		
		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);
		
		mergeTwoLists(list1,list2);
	}
	
//	Recursion
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//        if (l1.val <= l2.val) {
//            l1.next = mergeTwoLists(l1.next, l2);
//            return l1;
//        } else {
//            l2.next = mergeTwoLists(l1, l2.next);
//            return l2;
//        }
//    }

}
