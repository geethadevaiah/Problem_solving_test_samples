package Tree;

import java.util.ArrayList;
import java.util.List;

public class BFS_Display {

	public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return null;
        if(root.left == null &&  root.right == null) {
        	List<Integer> list1 = new ArrayList<>();
        	list1.add(root.val);
        	List<List<Integer>> retList = new ArrayList<>();
        	retList.add(list1);
        	return retList;
        }
        TreeNode curr = root;
        while(curr != null) {
        	
        }
    }

	public static void main(String[] args) {

	}

}
