package String;

public class isPalindrome {

	public static boolean isValidPalindrome(String s) {
	

		// [] is still not included in the regex exp
//		s = s.replaceAll("[ \\s\\t.,!@#$%^&*(){}:;'\"<>?~-_]", "").toLowerCase();
		
		s = s.replaceAll("[^0-9A-Za-z]", "").toLowerCase();
		if(s.length() < 2) 
			return true;
		int n = s.length();
		for(int i = 0 ; i < n / 2 ; i++)
			if(s.charAt(i) != s.charAt(n-i-1)) return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
	}
}
