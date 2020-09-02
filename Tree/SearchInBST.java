package Tree;

public class SearchInBST {
	public static TreeNode searchBST(TreeNode root, int val) {
	  if(root == null) return null;
		if(root.val == val) return root;
		if(val < root.val) return searchBST(root.left, val);
		else return searchBST(root.right, val);
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
		searchBST(root, 2);
	}
}
