package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointers {
	public Node copyRandomList(Node head) {
		// HashMap of Node, Node
        Map<Node, Node> map = new HashMap<Node,Node>();
        Node headCopy = head; // Head copy
    
        // copy complete head node to the map
        while(headCopy!=null){
             map.put(headCopy, new Node(headCopy.val));
             headCopy = headCopy.next;
        }

        // check each map entry set key n value pair 
        for(Map.Entry<Node,Node> entry : map.entrySet()){
            Node originalNode = entry.getKey();
            Node copiedNode = entry.getValue();
            // get the copy nodes from the map (not just originalNode.random)
            copiedNode.random = map.get(originalNode.random);
            copiedNode.next = map.get(originalNode.next);
        }
        // will return the value of the map which has key as head --> i.e. copy node head
        return map.get(head);
    }
}
