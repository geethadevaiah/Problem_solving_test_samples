package Ohers;

public class WildcardMatching {
	
	public static boolean patternMatchingCheck(String s, String p) {
		
		if(s.length() == 0 || p.length() == 0) return false;
		
		int i = 0 , j = 0;
		
		while ( i < s.length() && j < p.length()) {
			
			if(s.charAt(i) == p.charAt(j)) {
				i++;j++;
			}
			else if(p.charAt(j) == '*') {
				i++;
			}
		}
		
		if(i == s.length() && j == p.length()) {
			return true;
		}
		
		if(i == s.length() && j != p.length()) {
			while(j < p.length() && p.charAt(j) == '*')
				j++;
			return j == p.length();
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		String str = "xyxzzxy";
		String pattern = "x***y";
		System.out.println(patternMatchingCheck(str, pattern));
	}
}
