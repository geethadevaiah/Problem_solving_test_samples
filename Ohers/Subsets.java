package Ohers;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	
	public static List<List<Integer>> generateSubsets(int[] nums){
		
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		
		// adding the empty 
		output.add(new ArrayList<Integer>());
		
		for(int num : nums) {
			// create a new list of subset
			List<List<Integer>> newSubsets = new ArrayList<>();
			// pick each from the already existing list and add new num from array
			for(List<Integer> curr : output) {
				newSubsets.add(new ArrayList<Integer>(curr) {{add(num);}});
//				List<Integer> temp = new ArrayList<>();
//				temp.addAll(curr);
//				temp.add(num);
//				newSubsets.add(temp);
			}
			for(List<Integer> curr : newSubsets) {
				output.add(curr);
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(generateSubsets(nums));
	}
}
