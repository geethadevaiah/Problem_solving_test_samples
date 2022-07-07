package DP;

public class Stamp_denomination {
	
	public static void main(String[] args) {
		
		int[] stamps = { 1,5,10,20,50,100,500 };
		int[] count = {8,2,1,10,100,10,1};
		
		int n = stamps.length;
		//considering dp of length n
		int[] dp = new int[n];

		coinChangeSubset(stamps, count, 110, dp, n);
		if(dp[0] == -1) {
			System.out.println("Stamps not enough!"); return;
		}
		// printing the dp
		for(int i = 0 ; i < n ; i++) {
			if(dp[i] > 0)
			System.out.println(stamps[i] + " : " + dp[i] + " = " + stamps[i]*dp[i]);
		}
	}
	
	public static void coinChangeSubset(int[] stamps, int[] count, int target, int[] dp, int n) {
		if(n < 1 || target == 0) return;
		// till there are stamps remaining and target 
		while(n >= 1 && target > 0) {
//			System.out.println("w is "+target+"   n is "+n);
			// if the current stamp is less than the target, so that it can be used
			if(stamps[n-1] <= target) {
				int t = target / stamps[n-1];
				if(t > count[n-1]) t = count[n-1];
				target = target - stamps[n-1] * t;
				dp[n-1] = t; // add the stamp and update dp - count
			}
			n--; // move to next stamp
		}
		// stamps are exhausted still target is present, then stamps are not enough!
		if(target > 0) 	dp[0] = -1;
	}
	
	public static void coinChangeRecursive(int[] stamps, int[] count, int target, int[] dp, int n) {
//		System.out.println("w is "+target+"   n is "+n);
		
		// if there are no stamps and the target is already reached, return
		if(n < 1 && target <= 0) return;
		// if there are stamps remaining and the current stamp is less than target so that it can be used
		if(n >= 1 && target > 0 && stamps[n-1] <= target) {
			// then add the current stamp with proper denomination
			int t = target / stamps[n-1];
			if(t > count[n-1]) t = count[n-1];
			target = target - stamps[n-1] * t;
			// add the required amout of stamps to dp array
			dp[n-1] = t;
		}
		// if stamp included or not call recursively with changes
		coinChangeRecursive(stamps, count, target, dp, n-1);
		// all stamps are over and still target is remaining
		if(n < 1 && target > 0) dp[0] = -1;
	}
}
