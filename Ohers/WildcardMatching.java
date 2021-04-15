package Ohers;

import java.util.Arrays;

public class WildcardMatching {
	
	public static boolean patternMatchingCheck(String s, String p) {
		
		if(p.length() == 0 ) return s.length() == 0;
		
		// using DP to solve
		int n = s.length(), m = p.length();
		boolean t[][] = new boolean[n+1][m+1];
		// initial to 0
		for(int i=0 ; i< n ; i++)
			Arrays.fill(t[i], false);
		// empty pattern can match with empty string
		t[0][0] = true;
		
		// Only * can match with empty string
		// empty string case
		for(int j = 1; j <= m ; j++) {
			if(p.charAt(j-1) == '*')
				t[0][j] = t[0][j-1];
		}
		// fill the table in bottom-up fashion
		for(int i = 1; i <= n ; i++) {
			for(int j = 1; j <=m ; j++) {
				// Two cases if we see a '*'
                // a) We ignore '*'' character and move to next  character in the pattern, i.e., '*' indicates an empty sequence.
                // b) '*' character matches with ith character in input
                if (p.charAt(j - 1) == '*')
                    t[i][j] = t[i][j - 1] || t[i - 1][j];
 
                // Current characters are considered as matching in two cases
                // (a) current character of pattern is '?'
                // (b) characters actually match
                else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1))
                    t[i][j] = t[i - 1][j - 1];
 
                // If characters don't match
                else
                    t[i][j] = false;
			}
		}
		
		return t[n][m];
	}
	
	
	public static void main(String[] args) {
		
		String str = "xyxzzxy";
		String pattern = "x**zy";
		System.out.println(patternMatchingCheck(str, pattern));
	}
}
