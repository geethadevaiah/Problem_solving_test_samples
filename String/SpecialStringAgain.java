package String;

public class SpecialStringAgain {

	// WORKING!!!
	public static long substrCount(String str, int n ) {
		    // store count of special Palindromic substring 
		    int result = 0; 
		    // it will store the count of same char 
		    int[] sameChar = new int[n]; 
		    int i = 0; 
		    // traverse string character from left to right 
		    while (i < n)  { 
		        // store same character count 
		        int sameCharCount = 1; 
		        int j = i + 1; 
		  
		        // count smiler character 
		        while (j < n &&  str.charAt(i) == str.charAt(j)) { 
		            sameCharCount++; 
		            j++; 
		        } 
		  
		        // Case : 1 
		        // total num of substring generated are : K *( K + 1 ) / 2   --K=sameCharCount 
		        result += (sameCharCount * (sameCharCount + 1) / 2); 
		        // store current same char count in sameChar[] array 
		        sameChar[i] = sameCharCount; 
		        // increment i 
		        i = j; 
		    } 
		  
		    // Case 2: Count all odd length Special Palindromic substring 
		    for (int j = 1; j < n; j++) { 
		        // if current character is equal to previous one then we assign Previous  
		        // same character count to current one
		    	// a a b a a a
		    	// 2 _ 1 3 _ _  copy rest characters
		        if (str.charAt(j) == str.charAt(j - 1)) 
		            sameChar[j] = sameChar[j - 1]; 
		  
		        // aabaaa
		        // 221333
		        // case 2: odd length 
		        if (j > 0 && j < (n - 1) && 
		        (str.charAt(j - 1) == str.charAt(j + 1) && 
		             str.charAt(j) != str.charAt(j - 1))) 
		            result += Math.min(sameChar[j - 1], 
		                               sameChar[j + 1]); 
		    } 
		  
		    return result;
	}
	
	
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
