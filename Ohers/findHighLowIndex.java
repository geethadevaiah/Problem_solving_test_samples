package Ohers;

public class findHighLowIndex {
	public static int[] find_low_index(int[] nums, int target) {
		// find the low & high index by binary search
		int low = 0 , high = nums.length-1, n = nums.length;
		int lowIndex = low, highIndex = high;
		while(low < high) {
			int mid = low + (high - low) / 2;
			if(target < nums[mid]) high = mid-1;
			else if( target > nums[mid]) low = mid + 1;
			if(target == nums[mid]) {
				int k = mid;
				while(target == nums[mid]) {
					mid--;
				}
				lowIndex = mid+1;
				while(target == nums[k]) {
					k++;
				}
				highIndex = k-1;
				break;
			}
		}
		return new int[] {lowIndex, highIndex};
	}
	public static void main(String[] args) {
		int[] in = {5,7,7,8,8,8,8,8,8,8,8,8,8,10};
		int target = 8;
		int[] ret = find_low_index(in, target);
		for(int i = 0 ; i < ret.length ; i++) {
			System.out.println(ret[i]);
		}
	}
}
