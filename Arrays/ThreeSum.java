package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	
	public static List<List<Integer>> calculateThreeSum(int[] nums){

		//Get the set to void the duplicate addition of sum set
		Set<List<Integer>> result = new HashSet<List<Integer>>();
		// sort the array
		Arrays.sort(nums);
		
		for(int i = 0 ; i < nums.length - 2 ; i++) {
			// if the number is same as before do not consider
			if(i > 0 && nums[i] == nums[i-1]) continue;
			// pick two pointers from second item to last index
			int j = i + 1, k = nums.length - 1 ;
			// while the two pointers do not cross over
			while(j < k) {
				// addition of the three numbers
				int sum = nums[i] + nums[j] + nums[k];
				// if the sum is 0 then add to the set
				if(sum == 0 ) {
					// add to the list
					result.add(Arrays.asList(nums[i], nums[j], nums[k]));
					// update the pointers
					j++; k--;
				}
				// else if greater decrement the last pointer
				else if ( sum > 0) k--;
				// else increment the first pointer
				else j++;
			}
		}
		// send the array list back
		return new ArrayList<List<Integer>>(result);
	}
	
	
	public static List<List<Integer>> getThreeTripletsSum(int[] num){
		
		List<List<Integer>> result = new ArrayList<>();
		
		// two pointer technique (with fixing one pointer to get the rest two pointer traversing
		// Sort the array
		Arrays.sort(num);
		for(int i = 0 ; i < num.length ; i++) {
			// skip duplicates
			if(i != 0 && num[i] == num[i-1]) continue;
			// two pointers, pointing second and last index
			int j = i+1, k = num.length - 1;
			
			while(j < k) {
				if(num[i] + num[j] + num[k] == 0) { // found the triplet
					result.add(Arrays.asList(num[i] , num[j], num[k]));
					j++;
					// skip the duplicates
					while(j < k && num[j] == num[j-1]) j++;
				}
				// move the j pointer if the value is less than 0
				else if ( num[i] + num[j] + num[k] < 0) j++;
				// move the k pointer left, if the value sum is greater
				else k--;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
//		int[] nums = {-1, 0 , 1, 2 , -1, -4};
		int[] nums = {-2,0,0,2,2, 1, 0 , -1};

		System.out.println(calculateThreeSum(nums));
		System.out.println(getThreeTripletsSum(nums));
			
	}

}
