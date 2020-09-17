package String;

public class LongestCommonprefix {
	public static String longestCommonPrefix(String[] strs) {
		
		if (strs == null || strs.length == 0) return "";
	    for (int i = 0; i < strs[0].length() ; i++){
	        char c = strs[0].charAt(i);
	        for (int j = 1; j < strs.length; j ++) {
	            if (i == strs[j].length() || strs[j].charAt(i) != c)
	                return strs[0].substring(0, i);             
	        }
	    }
	    return strs[0];
		
		
		
		/*if(strs == null || strs.length == 0 ) return "";
		int index = 0;
		StringBuilder res = new StringBuilder();
		
		while(true) {
			for(int i = 0 ; i < strs.length ; i++) {
				// 1. either the row is null
				// 2. the index is greater than the length of the row
				// 3. the character is not the same as the previous character
				if(strs[i] == null || strs[i].length() == 0 || index >= strs[i].length() 
						|| (i-1)>= 0 && strs[i].charAt(index) != strs[i-1].charAt(index)) {
					return res.toString();
				}
			}
			
			res.append(strs[0].charAt(index++));
		}*/
		
		
		// my code 5.1 % :(
        /*String prefix = "";
        if(strs.length == 0 || strs[0].length() == 0) return prefix;
        if(strs.length == 1) return strs[0];
        int i = 0, j = 0;
		while(i < strs[j].length()) {
			char c = strs[j++].charAt(i) ;
			while(j < strs.length && i < strs[j].length()) 
				if(c != strs[j++].charAt(i)) 
					return prefix; 
			
			if(j == strs.length )
				prefix += c;
			i++;j = 0;
		}
		return prefix;*/
    }
	
	public static void main(String[] args) {
		String[] strs = {"aass","aas", "b"};
		System.out.println(longestCommonPrefix(strs));
	}
}
