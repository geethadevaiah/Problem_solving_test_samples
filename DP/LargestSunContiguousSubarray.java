package DP;

public class LargestSunContiguousSubarray {

	// using Kadane algorithm
	// Flobal_max and Local_max method
	public static int maxSum(int[] arr, int n) {
		
		int global_max = 0, local_max = 0;
		for(int i = 0 ; i < n ; i++) {
			local_max += arr[i];
			// check if current sum is greater than global sum calculated till previous element
			if(global_max < local_max) global_max = local_max;
			// if local sum goes below 0
			if(local_max < 0) local_max = 0;
			
//			local_max = Math.max(arr[i], local_max + arr[i]);
//			global_max = Math.max(global_max, local_max);
			
		}
		// return global sum
		return global_max;
	}
	
	public static void main(String[] args) {
		int arr[] = {-2, -3,4,-1,-2,1,5,-3};
		System.out.println((maxSum(arr, arr.length)));
	}
}
