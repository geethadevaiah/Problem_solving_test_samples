import java.util.ArrayList;
import java.util.List;


public class PreorderTraversal {

	public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> order = new ArrayList<>();
        traverseTreePreorder(root, order);
        return order;
    }
	
	public static void traverseTreePreorder(TreeNode root, List<Integer> order) {
		if(root != null) {
			order.add(root.val);
			if(root.left != null)
				traverseTreePreorder(root.left, order);
			if(root.right != null)
				traverseTreePreorder(root.right, order);
		}
	}
	
	public static void main(String[] args) {

		TreeNode node3 = new TreeNode(3);
		TreeNode emptyNode = new TreeNode();
		TreeNode node2 = new TreeNode(2,node3,emptyNode);
		TreeNode node1 = new TreeNode(1,emptyNode,node2);
		List<Integer> list = preorderTraversal(node1);
		for(Integer i : list) {
			System.out.println(i);
		}
	}

}
