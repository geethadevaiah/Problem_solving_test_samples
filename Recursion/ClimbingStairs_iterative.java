package Recursion;

public class ClimbingStairs_iterative {

	// efficient method with time C = n & space is 1
	
	public int effClimbStairs(int n) {
		if(n == 1) return 1;
		int first = 1, second = 2;
		
		for(int i = 3; i <= n ; i++) {
			int third = first + second;
			first = second;
			second = third;
		}
		return second;
	}
	
	
	// using dynamic programming
 public int climbStairs(int n ) {
	 if(n == 1) return 1;
     int[] dp = new int[n + 1];
      // initially consider for 1st step. only 1
      dp[1] = 1;
      // number of steps to climb 2nd step is 1
      dp[2] = 2;
      for(int i = 3 ; i <= n ; i++) {
          // solve the subproblems
          // every step will be equal to the sum of its 
          //previous and one more previous to that number
          dp[i] = dp[i - 1] + dp[i - 2];
      }
      // return the number of the steps required for the nth steps
      return dp[n];
 }
 
}
