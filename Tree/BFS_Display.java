package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS_Display {

	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
		
        // return empty
        if(root == null) return result;
        
        // get a Queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        // till there is something in the queue
        while(queue.size() > 0) {
        	// get the sublist
        	List<Integer> subList = new ArrayList<>();
        	int size = queue.size();
        	for(int i = 0 ; i < size ; i++) {
        		// get the item from the queue
        		TreeNode head = queue.poll();
        		// add it to the sublist
        		subList.add(head.val);
        		// add left & right nodes of the head to queue if exists
        		if(head.left != null) queue.add(head.left);
        		if(head.right != null) queue.add(head.right);
        	}
        	result.add(subList);
        }
		
		return result;
    }

	public static void main(String[] args) {

	}

}
