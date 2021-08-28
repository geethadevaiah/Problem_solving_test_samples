package DP;

public class MaxSumIncreasingSubsequence {

	
	public static int maxSum(int[] arr, int n ){
		int max = 0, omax = 0;
		
		// creating dp array to store the max sum at that index.
		int[] dp = new int[n];
		
		// loop through arrays and dp
		for(int i = 0 ; i < n; i++) {
			// set to 0
			max = 0;
			// to compare each element in dp with the current element in arr 
			for(int j = 0; j < i ; j++) {
				// if the current element is greater than jth element (all subset elements before i) 
				if(arr[j] < arr[i]) {
					// get the max among the ones which are less than the current element
					max = Math.max(max, dp[j]);
				}
			}
			// set the dp so the ith index has max sum ending with ith element-subset-sum
			dp[i] = arr[i] + max;
			// find the overall max in the dp array
			omax = Math.max(omax, dp[i]);
		}
		return omax;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 101, 2, 3, 100, 4, 5}; // output = 106
		
		System.out.println(maxSum(arr, arr.length));
	}
}
