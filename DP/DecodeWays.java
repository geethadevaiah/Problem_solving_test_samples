package DP;

public class DecodeWays {
	
	/**
	 * 1) If the last digit is non-zero, recur for the remaining (n-1) digits and 
	 * add the result to the total count. 
	   2) If the last two digits form a valid character (or smaller than 27), 
	   recur for remaining (n-2) digits and add the result to the total count.
	 */
	
	public static int decodeWaysStrFnDP(String s) {
		
		int n = s.length();// length
		// if the string starts with 0 or the length is 0, return 0
		if(s.charAt(0) == '0' || n == 0) return 0;
		//if the string is of only 1 length then return count 
		if(n == 1) return 1;
		
		// get the dp array to store the count of all the string chars
		int[] count = new int[n + 1];
		// initialize first index of the array to 1
		count[0] = 1;
		count[1] = 1;
		
		// loop through the second  index in s
		for(int i = 2 ; i <= n ; i++) {
			count[i] = 0;
			if(s.charAt(i-1) > '0') {
				count[i] = count[i-1];
			}
			// calculate the value instead
			int val = (s.charAt(i-2) - '0')* 10 + (s.charAt(i-1)-'0');
			//if((s.charAt(i-2) == '1'|| s.charAt(i-2) == '2') &&(s.charAt(i-1) < '7') && ()) {
			
			// if the value of previous two indices is between 10 to 26,
			// then add additional previous count to current count.
			if(val <= 26 && val >= 10) {
				count[i] += count[i-2]; 
			}
		}
		// return the final count
		return count[n];
	}
	
	public static void main(String[] args) {
		System.out.println(decodeWaysStrFnDP("1226")); 
		
	}
}
