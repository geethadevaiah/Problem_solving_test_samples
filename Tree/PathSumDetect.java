package Tree;

public class PathSumDetect {
	public boolean hasPathSum(TreeNode root, int sum) {
        // if root is null - base case 1
		if(root == null) return false;

		// update the sum
		sum = sum - root.val;
		// check whether it is the leaf node n sum is 0 - base case 2
		if(root.left == null && root.right == null) {
			return sum == 0;
		}
		
		// check for the leaf nodes with the updated sum
		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
		    
	}
}
