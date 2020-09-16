package String;

public class Atoi {
	public static int myatoi(String str) {
		if(str.equals("")) return 0;
		long returnVal = 0;
		int sign = 1, i = 0;
		
		while(i < str.length() && str.charAt(i) == ' ') i++; 
			
		// if the str starts with digits or negative numbers
		if(i < str.length() && (str.charAt(i) == '-' || Character.isDigit(str.charAt(i)) || str.charAt(i) == '+')) {
			if(str.charAt(i) == '-') {
				sign = -1; i++;
			}
			else if(i < str.length() && str.charAt(i) == '+' ) i++;
				
			if(i < str.length() && !Character.isDigit(str.charAt(i))) return 0;
			
			while(i < str.length() && Character.isDigit(str.charAt(i)) && 
		               sign * returnVal < Integer.MAX_VALUE && sign * returnVal > Integer.MIN_VALUE) {
				returnVal = returnVal *10 + (str.charAt(i++) - '0');
			}
			// check max n min
			if(sign * returnVal > Integer.MIN_VALUE && sign * returnVal < Integer.MAX_VALUE)
				return (int)(sign * returnVal);
			return sign * returnVal >= Integer.MAX_VALUE ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		}
		return 0;
	}
		
	public static void main(String[] args) {
		System.out.println(myatoi("9223372036854775808"));
	}
}
