package Tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traverseTreeInOrder(root, list);
        return list;
    }
    
    public void traverseTreeInOrder(TreeNode root, List<Integer> list){
        if(root != null){
            if(root.left != null)
                traverseTreeInOrder(root.left, list);
            list.add(root.val);
            if(root.right != null)
                traverseTreeInOrder(root.right, list);
        }
    }
}
