package String;

import java.util.ArrayList;
import java.util.List;

public class SherlockAndAnagrams {
	
	// return the anagrammatic pairs count
	public static int sherlock(String s) {
		int count  = 0;
		// find the substrings to find the anagrams of
		// isAnagram function
		// with k unique chars, subset is k (k + 1) / 2
		
		List<String> subsets = getALlSubstring(s);
		
		for(int i = 0 ;i < subsets.size() ; i++) {
			for(int j = i + 1 ; j < subsets.size() ; j++) {
				if(i != j && subsets.get(i).length() == subsets.get(j).length() && isAnagram(subsets.get(i), subsets.get(j)))
					count++;
			}
		}
		return count;
	}
	
	
	private static List<String> getALlSubstring(String s) {
		List<String> res = new ArrayList<>();
		for(int i = 0 ; i < s.length() ; i++) 
			for(int j = i + 1 ;  j < s.length() + 1 ; j++) 
				res.add(s.substring(i,j));
		return res;
	}
	
	private static boolean isAnagram(String a, String b) { // anagrams have same signatures
		int[] charsA = new int[26];
		int[] charsB = new int[26];
		
		for(int i = 0  ; i < a.length(); i++)
			charsA[a.charAt(i) - 'a']++;
		for(int i = 0  ; i < b.length(); i++)
			charsB[b.charAt(i) - 'a']++;
		
		for(int i = 0 ; i < 26 ; i++) 
			if(charsA[i] != charsB[i])
				return false;
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(sherlock("cdcd"));
	}
}
