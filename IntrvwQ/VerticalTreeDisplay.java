package IntrvwQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.Map.Entry;
import java.util.TreeMap;

import Tree.TreeNode;

public class VerticalTreeDisplay {

	
	/*public static void displayVertical(TreeNode root) {
		// structure
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		
		int count = 0;
		List<Integer> list = new ArrayList<>();
		list.add(root.val);
		map.put(count, list);
		

		while(root != null) {
			
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
		}
		entryMapCheckleft
		entryMapCheckRight
	}*/
	
	public static void getAllRootMapping(TreeNode node , int h , Map<Integer, Vector<Integer>> map) {
		
		if(node == null) return;
		
		Vector<Integer> getList = map.get(h);
		if(getList == null) { // if still there is no list with this h key
			getList = new Vector<>();
			getList.add(node.val);
		} else {
			getList.add(node.val);
		}
		map.put(h, getList);
			
		getAllRootMapping(node.left, h-1, map);
		getAllRootMapping(node.right, h+1, map);
		
	}
	
	public static void printVerticalOrder(TreeNode node) {
		
		// get the map of numbers and arraylist
		TreeMap<Integer, Vector<Integer>> map = new TreeMap<>();
		getAllRootMapping(node, 0, map);
		for(Entry<Integer, Vector<Integer>>  set: map.entrySet()) {
			System.out.println(set.getValue());
		}
	}
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.right = new TreeNode(8);
        root.right.right.right = new TreeNode(9);
        System.out.println("Vertical Order traversal is");
        printVerticalOrder(root);
		
	}
	
	
//	public static void entryMapCheckleft(Map<Integer, List<Integer>>  map, int count, TreeNode root) {
//		// check with map.. count -> map
//		// if yes add to the list
//		// else new entry to map
//		
//		List<Integer> l1 = map.get(count);
//		
//		if(l1.size() >0) {
//			l1.add(root.val);
//		}
//		else {
//			l1 = new ArrayList<>();
//			l1.add(root.val);
//		}
//		map.put(count, l1);
//		
//		//  recursion
//		if(root.left != null)
//			entryMapCheckleft()
//	
//	}
	
}
