package IntrvwQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Tree.TreeNode;

public class VerticalTreeDisplay {

	
	public static void displayVertical(TreeNode root) {
		
		
		// structure
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		
		int count = 0;
		List<Integer> list = new ArrayList<>();
		list.add(root.val);
		map.put(count, list);
		

		/*while(root != null) {
			
			//left
			if(root.left != null) {
				root = root.left;
				count++;
				entryMapCheckleft(map, count, root);
			}
			// right
			if(root.right != null) {
				root = root.right;
				count--;
				entryMapCheckRight(map, count, root);
			}
			
		}*/
		
		entryMapCheckleft
		
		
		entryMapCheckRight
		
	}
	
	public static void entryMapCheckleft(Map<Integer, List<Integer>>  map, int count, TreeNode root) {
		// check with map.. count -> map
		// if yes add to the list
		// else new entry to map
		
		List<Integer> l1 = map.get(count);
		
		if(l1.size() >0) {
			l1.add(root.val);
		}
		else {
			l1 = new ArrayList<>();
			l1.add(root.val);
		}
		map.put(count, l1);
		
		//  recursion
		if(root.left != null)
			entryMapCheckleft()
	
	}
	
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		
		
	}
}
