package DP;

public class LongestIncreasingSubsequence {

	public static int longestIncreasingSubs(int[] arr, int n ) {
		
		// creating dp array
		int[] dp = new int[n];
		// set max and overall max
		int max = 0, omax = 0;
		
		// dp is 1D array where each element at j with have the max number of subsequence
		// ending with jth element.
		// so iterating through each element, check whether the current element
		// is greater than iterating element and set the max count
		
		
		for(int i = 0 ; i < n ; i++) {
			max = 0;
			for(int j = 0 ; j < i ; j++) {
		    // find the longest increasing subsequence that ends with `arr[j]`
	        // where `arr[j]` is less than the current element `arr[i]`
	 
				if(arr[j] < arr[i]) {
					// get the max of dp
					max = Math.max(dp[j], max);
				}
			}
			// so the dp at i will be one greater than max ( since count is calculated not sum ) 
			dp[i] = 1 + max;
			// get the overall max as the last in dp may not be the max count
			omax = Math.max(omax, dp[i]);
		}
		return omax;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
		System.out.println(longestIncreasingSubs(arr, arr.length));
		
	}
	
}
