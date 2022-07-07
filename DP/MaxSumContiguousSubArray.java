package DP;

public class MaxSumContiguousSubArray {
	
	public static int maxSubArray(int[] nums, int n) {
		
		// take curr sum and max sum for every iteration
		int currSum = nums[0], maxSum = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < n ; i++) {
			
			currSum = currSum + nums[i];
			maxSum = Math.max(currSum, maxSum);
			// check for -ve
			if(currSum < 0) currSum = 0;
			
		}
		return maxSum;
	}
	

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums, nums.length));
	}
}
