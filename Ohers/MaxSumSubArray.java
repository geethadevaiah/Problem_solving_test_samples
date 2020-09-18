package Ohers;
/***
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
	Output: 6
 * 
 */
public class MaxSumSubArray {
	public static int maxsumArr(int[] nums) {
		int currsum = 0, maxsum = nums[0];
		for(int i = 0 ; i < nums.length ; i++) {
			currsum += nums[i];
			if(currsum > maxsum) 
				maxsum = currsum;
			if(currsum < 0)
				currsum = 0;
		}
		
		return maxsum;
	}
	
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxsumArr(nums));
	}
}
