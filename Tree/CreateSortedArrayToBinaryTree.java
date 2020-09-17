package Tree;

public class CreateSortedArrayToBinaryTree {
	public TreeNode sortedArrayToBST(int[] nums) {
        // create a recursive call
		 return createBST(nums, 0, nums.length-1);
	 }
	 
	 public static TreeNode createBST(int nums[], int min, int max) {
		 
		 if(min > max) return null;
		 // get the middle val in the array
		 //int mid = min + (max - min)/2;
         int mid = (min + max + 1 ) / 2;
		 // create the middle node tree
		 TreeNode node = new TreeNode(nums[mid]);
		 // create the left & right tree recursively.
		 node.left = createBST(nums, min, mid - 1);
		 node.right = createBST(nums, mid + 1, max);
		 
		 return node;
	 }
}
