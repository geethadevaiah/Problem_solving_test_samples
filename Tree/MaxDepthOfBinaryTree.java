package Tree;

public class MaxDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
        if(root == null ) return 0;
        int left_max = maxDepth(root.left); // go till left leaf nodes
        int right_max = maxDepth(root.right); // till right leaf nodes
        return Math.max(left_max, right_max) + 1; // return max n additional 1
    }
}
