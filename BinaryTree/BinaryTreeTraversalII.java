package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Tree.TreeNode;

public class BinaryTreeTraversalII {

	public static List<List<Integer>> levelOrderBottom(TreeNode root){
		// returning list of list of integers from level bottom till up
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		// if root is null return the empty result
		if(root == null) return result;
		
		// add the root to the queue of linkedlist
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		
		// traverse till root is empty
		while(!queue.isEmpty()) {
			// temp list to add to result
			List<Integer> currList = new ArrayList<>();
			for(int i = 0 ; i < queue.size() ; i++) { // empty the queue
				// get the first node from queue
				TreeNode t = queue.poll();
				currList.add(t.val);// add the value
				
				// if right or left is present add accordingly
				if(t.left != null) queue.add(t.left);
				if(t.right != null) queue.add(t.right);
			}
			// add to the result list
			result.add(currList);
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {

	}

}
