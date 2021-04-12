package Ohers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
	
	public static List<List<Integer>> generatePermutations(int[] nums){
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		Set<Integer> taken = new HashSet<>(); // to keep track of the ones used or in use
		permutations(new ArrayList<Integer>(), nums,output, taken);// call recursion
		return output;
	}
	
	public static void permutations(List<Integer> list, int[] nums, List<List<Integer>> output, Set<Integer> taken){	
		// if the list size of full nums, add the list to the final output
		if(list.size() == nums.length) 
			output.add(new ArrayList<>(list));
		
		// loop though each items in nums
		for(int i = 0 ; i < nums.length ; i++) {
			if(taken.contains(i)) continue;// check whether it is already taken
			taken.add(i);
			list.add(nums[i]);// if not add
			permutations(list, nums, output, taken);// calling by backtracking
			list.remove(list.size()-1); // remove after adding to the list
			taken.remove(i);
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {0,1};
		// result output list
		
		System.out.println(generatePermutations(nums));
	}
}
