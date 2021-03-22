package DP;

public class DecodeWays {
	
	/**
	 * 1) If the last digit is non-zero, recur for the remaining (n-1) digits and 
	 * add the result to the total count. 
	   2) If the last two digits form a valid character (or smaller than 27), 
	   recur for remaining (n-2) digits and add the result to the total count.
	 */
	
	public static int decodeWaysStrFnDP(String s) {
		
		int n = s.length();
		if(s.charAt(0) == '0' || n == 0) return 0;
		if(n == 1) return 1;
		
		int[] count = new int[n + 1];
		count[0] = 1;
		count[1] = 1;
		
		for(int i = 1 ; i < n ; i++) {
			count[i] = 0;
			if(s.charAt(i-1) > '0') {
				count[i] = count[i-1];
			}
			if((i-2 >= 0)&&(s.charAt(i-2) == '1'|| s.charAt(i-2) == '2') &&(s.charAt(i-1) < '7')) {
				count[i] += count[i-1]; 
			}
		}
		return count[n];
	}
	
//	public static 
	
	public static void main(String[] args) {
		System.out.println(decodeWaysStrFnDP("121")); 
		
	}
}
