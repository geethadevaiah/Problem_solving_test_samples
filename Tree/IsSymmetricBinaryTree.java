package Tree;

public class IsSymmetricBinaryTree {
	
	public boolean isSymmetry(TreeNode root) {
		// call the recursive tree function
		return isMirror(root, root);
	}
    
    public boolean isMirror(TreeNode t1, TreeNode t2){
    	// if both are null then it is true
        if(t1 == null && t2 == null) return true;
        // of either are null then false
        if(t1 == null || t2 == null) return false;
        
        // check if both the values are same
        // also the left node of t1 = right node of t2.. vice versa
        return (t1.val == t2.val)
            && isMirror(t1.right, t2.left)
            && isMirror(t1.left, t2.right);
    }
}

