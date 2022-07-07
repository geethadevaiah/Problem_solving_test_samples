package Class_revision.Recursion_and_Backtracking;

import java.util.Arrays;

public class PermutationInString {

	
	public static boolean checkInclusion(String s1, String s2) {
		
		if(s1.length() > s2.length()) return false;
		if(s1.length() == 0) return true;
		
		// take like a sliding window
		// keep on checking with the next character and removing the count of the previous 
		// char from the window and check whether both arrays are equal or not!
		
		int ch1[] = new int[26];
		int ch2[] = new int[26];
		int x = s1.length(), y = s2.length();
		
		for(int i = 0 ; i < x ; i++) {
			// set initial (say 2) count of each of the array
			ch1[s1.charAt(i) - 'a']++;
			ch2[s2.charAt(i) - 'a']++;
		}
		
		for(int i = x ; i < y ; i++) {
			if(Arrays.equals(ch1, ch2)) return true;
			ch2[s2.charAt(i-x) - 'a']--; // removing previous character from the window
			ch2[s2.charAt(i) - 'a']++; // take next char to the window
		}
		if(Arrays.equals(ch1, ch2)) return true;
		else 
			return false;
	}
	
	
	public static void main(String[] args) {
		/**
		 * Given two strings s1 and s2, return true if s2 contains a 
		 * permutation of s1, or false otherwise.
		 */
		
		String s1 = "ab";
		String s2 = "eidbaooo";
		
		System.out.println(checkInclusion(s1,s2) );
	}
}
