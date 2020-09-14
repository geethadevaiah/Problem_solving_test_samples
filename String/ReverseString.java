package String;

public class ReverseString {
	
	public static void helper(char[] s, int start, int end) {
		if(start >= end) return ;
		char temp = s[start];
		s[start++] = s[end];
		s[end--] = temp;
		helper(s, start, end);
	}
	
	public static void reverse(char[] s) {
		helper(s, 0 , s.length-1);
		reverseStr(s);
	}
	
	/*** linear method ****/
	public static void reverseStr(char[] s) {
		if(s.length < 2) return;
		
		int start = 0, end = s.length;
		while(start < end) {
			char temp = s[start];
			s[start++] = s[end];
			s[end--] = temp;
		}
	}
	
	
}
