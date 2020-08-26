package Tree;
import java.util.ArrayList;
import java.util.List;


public class PostorderTraversal {

	public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> order = new ArrayList<>();
        traverseTreePostorder(root, order);
        return order;
    }
	
	public static void traverseTreePostorder(TreeNode root, List<Integer> order) {
		if(root != null) {
			if(root.left != null)
				traverseTreePostorder(root.left, order);
			if(root.right != null)
				traverseTreePostorder(root.right, order);
			order.add(root.val);
		}
	}
	
	public static void main(String[] args) {

		TreeNode node3 = new TreeNode(3);
		TreeNode emptyNode = new TreeNode();
		TreeNode node2 = new TreeNode(2,node3,emptyNode);
		TreeNode node1 = new TreeNode(1,emptyNode,node2);
		List<Integer> list = postorderTraversal(node1);
		for(Integer i : list) {
			System.out.println(i);
		}
	}

}
