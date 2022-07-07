package DP;

import java.util.Arrays;

//Given an integer n, return the least number of perfect square numbers that sum to n.
public class PerfectSquares {

//	int ans;
	public static int numSquaresRecursion(int n) {
		
		
		// TLE for recursion ------------------
		
		// first check if n <= 3.. because n=1,2,3 is n
		
		if(n <= 3) return n;
		int ans = n;
		// split from 1... to i*i < n
		for(int i = 1 ; i*i <= n ;i++) 
			ans = Math.min(ans, 1 + numSquaresRecursion(n - i*i));
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(numSquaresRecursion(15));
		System.out.println(numSquaresDp(16));
		System.out.println(numSquaredDpNRecursion(15));

		// considering it as splitting everytime as 1, and 1-n remaining squares
		// (1*1 and n - 1*1, 2*2 and n - 2*2 ......  + 1)
	}
	
	// dp method
	
	public static int numSquaresDp(int n) {
		
//		if(Math.floor(Math.sqrt(n)) == Math.ceil(Math.sqrt(n))) return 1;
		
		int[] dp = new int[n+1];
		dp[0] = 0;
		
		for(int i = 1; i <= n ; i++) {
			dp[i] = i;
			for(int j = 1 ; j*j <= i ; j++) {
				dp[i] = Math.min(dp[i], 1 + dp[i - j*j]);
			}
		}
		return dp[n];
	}
	
	// recursion and dp
//	static int[] dp1;
	
	public static int numSquaredDpNRecursion(int n) {
		
		int[] dp1 = new int[n+1];
		Arrays.fill(dp1, -1); // initialize array with -1
		return numR(n, dp1);
	}
	public static int numR(int n , int[] dp1) {
		if(n <= 3) return n ;
		if(dp1[n] != -1) { // if there is already computed result, return it
			return dp1[n];
		}
		int ans = n;
		for(int i = 1; i*i <= n ; i++) 
			ans = Math.min(ans,  1 + numR(n - i*i, dp1));
		return ans;
	}
}
