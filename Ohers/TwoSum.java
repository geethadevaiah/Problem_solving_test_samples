package Ohers;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
        for(int i = 0 ; i < nums.length; i++) {
            int complement = target - nums[i];
            // check for the target in map
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
            }
            // add to map
            map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No result found!");
		
		
	}
}
