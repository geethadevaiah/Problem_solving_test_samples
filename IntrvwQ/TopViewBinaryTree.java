package IntrvwQ;

import Tree.TreeNode;

public class TopViewBinaryTree {
	public static void topView(TreeNode root) {
		if(root == null) return;
		System.out.println(root.val);
		topViewLeft(root.left);// left elements
		topViewRight(root.right); // right elements
	}
	
	public static void topViewLeft(TreeNode node) {
		if(node == null) return;
		System.out.println(node.val);
		topViewLeft(node.left);		
	}
	
	public static void topViewRight(TreeNode node) {
		if(node == null) return;
		System.out.println(node.val);
		topViewRight(node.right);
	}
	
	
	public static void main(String[] args) {
		
		// root
		TreeNode root = new TreeNode(10);
		// first level children
		TreeNode left = new TreeNode(5);
		TreeNode right = new TreeNode(20);
		root.left = left;
		root.right = right;
		//second level 
		TreeNode left1 = new TreeNode(1);
		TreeNode right1 = new TreeNode(7);
		TreeNode left2 = new TreeNode(15);
		TreeNode right2 = new TreeNode(21);
		
		root.left.left = left1;
		root.left.right = right1;
		
		root.right.left = left2;
		root.right.right = right2;
		
		topView(root);
		
	}
}
