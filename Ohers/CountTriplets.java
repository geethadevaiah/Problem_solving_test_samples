package Ohers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {
	public static long countTripletNums(List<Long> arr, long r) {
		long ret = 0;
		// find the triplets in array multiples of r
		// get two hash map left n right.. fill them up as u traverse arr left to right
		
		Map<Long, Integer> left = new HashMap<>();
		Map<Long, Integer> right = new HashMap<>();
		
		for(int i = 0 ; i < arr.size() ; i++)// right map is filled 
			right.put(arr.get(i), right.getOrDefault(arr.get(i), 0) + 1);
		
		for(int i = 0 ; i < arr.size() ; i++) {
			// keep the counts of left n right elements
			// left is a/r    right a * r
			long c1 = 0, c2 = 0;
			
			// check whether the number is divisible by r
			if(arr.get(i) % r == 0)// get the count of a/r to the left 
				c1 = left.getOrDefault(arr.get(i) / r, 0);
			
			// decrement the count of curr element from the right hash
			right.put(arr.get(i), right.getOrDefault(arr.get(i), 0) - 1);
			
			// get the count of right ( a * r ) elements from the right hash
			c2 = right.getOrDefault(arr.get(i) * r, 0);
			
			// calculate the total number of count c1 * c2
			ret += c1 * c2;
			
			// increment the count of curr element from the left hash
			left.put(arr.get(i), left.getOrDefault(arr.get(i), 0) + 1);
		}
		return ret;
	}
	
	public static void main(String[] args) {
		List<Long> list = new ArrayList<Long>();
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);list.add((long) 1);
		list.add((long) 1);list.add((long) 1);list.add((long) 1);
		System.out.println(countTripletNums(list, 1));
	}
}
