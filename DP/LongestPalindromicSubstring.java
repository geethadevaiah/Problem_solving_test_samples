package DP;

// this is solved using Dynamic programming!

public class LongestPalindromicSubstring {
	
	
	public static String longPalindromeSubstrFn(String str) {
		
		if(str == "" || str.length() == 0 || str.length() == 1) return str;
		int maxLength = 1 , start = 0, end = 0; // at least one character present
		// applying dp
		int[][] dp = new int[str.length()][str.length()];
		// all single chars are palindrome
		for(int i = 0 ; i < str.length() ; i++)	dp[i][i] = 1;// fill all the diagonals

		// if every adjacent characters are same then update the matrix
		for(int i = 0 ; i < str.length()-1 ; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				dp[i][i+1]= 1;
				maxLength = 2; // then the longest palidrome is of length 2
				start = i;
			}
		}
		
		
		for(int i = 3 ; i <= str.length() ; i++) {
			for(int j = 0 ; j < str.length() - i + 1; j++) {
				// find the end pointer
				end = i + j - 1;
				if(dp[j + 1][end-1] == 1 // if in between strings are palidrome 
						&& str.charAt(j) == str.charAt(end)// if boundary chars are same
						) {// then it is a palindrome
					dp[j][end] = 1;  // update the matrix
					//maxLength = Math.max(maxLength, end-j+1); // update the maxlength from end index to length
					if(i >  maxLength) {
						start = j;
						maxLength = i;
					}
				}
			}
		}
		return str.substring(start, maxLength);
	}

	public static void main(String[] args) {
		System.out.println(longPalindromeSubstrFn("aabkdaa"));
	}

}
