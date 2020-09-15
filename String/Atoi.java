package String;

public class Atoi {
	public static int myatoi(String str) {
		if(str.equals("")) return 0;
		int returnVal = Integer.MIN_VALUE;
		boolean isNegative = false;
		
		while(str.startsWith(" ")) 
			str = str.substring(1);
		// if the str starts with digits or negative numbers
		if(str.startsWith("-") || Character.isDigit(str.charAt(0))) {
			if(str.startsWith("-")) {
				isNegative = true;
				str = str.substring(1);
			}
			if(!Character.isDigit(str.charAt(0))) return 0;
			str = str.replaceAll("[^0-9]","");
			
			returnVal = isNegative ? -1 * Integer.parseInt(str) : Integer.parseInt(str);
			if(returnVal < Integer.MIN_VALUE) return Integer.MIN_VALUE;
			else if(returnVal > Integer.MAX_VALUE) return Integer.MAX_VALUE;
			return returnVal;
		}
		return 0;
	}
		
	public static void main(String[] args) {
		System.out.println(myatoi("-91283472332"));
	}
}
