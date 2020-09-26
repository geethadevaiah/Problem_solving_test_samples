package String;

public class SpecialStringAgain {

	public static boolean checkSlopeString(String s, int l, int r) {
		char a = s.charAt(l);
		String check = s.substring(l, r+1);
		System.out.println(check); 
		
		if(check.length() == 2) {
			if(check.charAt(0) == check.charAt(1)) return true;
			return false;
		}
		while(l<r && s.charAt(l) == a) l++;
		while(l<r && s.charAt(r) == a) r--;
		System.out.println("l = "+l+"   r = "+r);
		if(r ==l ) {
			if(check.length() %2 == 0 && r+1 < check.length()) {
				if(s.charAt(l) == s.charAt(r+1)) return true;
			}
			else
				if(s.charAt(l) == s.charAt(r)) return true;
		}
		System.out.println(check);
		return false;
	}
	public static int getSpecialStringNum(int n , String s) {
		if(n < 2) return n;
		int count = n, setCount = 1;
		while(setCount < n) {// check for each length of series
			for(int j = 0 ; j+setCount < n ; j++) {
				if(checkSlopeString(s, j, j+setCount)) 
					count++;
			}
			setCount++;
		}
		return count;			
	}
	public static void main(String[] args) {
//		System.out.println(getSpecialStringNum(8,"mnonopoo"));
//		System.out.println(getSpecialStringNum(4,"aaaa"));
		System.out.println(getSpecialStringNum(7,"abcbaba"));
	}
}
