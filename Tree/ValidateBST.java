package Tree;

public class ValidateBST {
	public boolean isValidBST(TreeNode root) {
        return isValBST(root, null, null);
    }
    public static boolean isValBST(TreeNode root, Integer min, Integer max){
        if(root == null) return true;
        
        if(min != null && root.val <= min) return false;
        if(max != null && root.val >= max) return false;
        
        return isValBST(root.left, min, root.val) && isValBST(root.right, root.val, max);
    }
}
