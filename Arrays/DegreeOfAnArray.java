package Arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DegreeOfAnArray {

	 public static int findShortestSubArray(int[] nums) {
		 	
		 	if(nums.length == 0) return 0;
		 	int n = nums.length;
	        // make the arrangements and counting while traversing for finding the degree itself
		 	int ans = n;
		 	// left and right map to keep count of left and right occurrences of the number
		 	Map<Integer, Integer> left = new HashMap<Integer, Integer>(), 
		 			right = new HashMap<Integer, Integer>(), count = new HashMap<Integer, Integer>();	 
		 	
		 	for(int i = 0 ; i < n ; i++) {
		 		int x = nums[i];
		 		if(left.get(x) == null) left.put(x, i); // fill index only if not already filled.. first left occurrence
		 		right.put(x, i);// fill the right with index all time to get last occurrence
		 		count.put(x, count.getOrDefault(x, 0)+1); // increment the count to find degree
		 	}
		 	int degree = Collections.max(count.values()); // degree with max value
		 	
		 	for(int key : count.keySet()) {
		 		if(count.get(key) == degree) { // get the key in count same as degree
		 			ans = Math.min(ans, right.get(key) - left.get(key) + 1); // find the min such window
		 		}
		 	}
		 	return ans;
	    }
	
	public static void main(String[] args) {
		int[] inputarr = {1,2,2,3,1};
        System.out.println(findShortestSubArray(inputarr));
	}
	
}
