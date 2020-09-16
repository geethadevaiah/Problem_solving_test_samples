package String;

public class LongestCommonprefix {
	public static String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if(strs.length == 0 || strs[0].length() == 0) return prefix;
        if(strs.length == 1) return strs[0];
        int i = 0, j = 0;
		while(i < strs[j].length()) {
			char c = strs[j++].charAt(i) ;
			while(j < strs.length ) 
				if(c != strs[j++].charAt(i)) return prefix; 
			
			if(j == strs.length )
				prefix += c;
			i++;j = 0;
		}
		return prefix;
    }
	
	public static void main(String[] args) {
		String[] strs = {"aa","a"};
		System.out.println(longestCommonPrefix(strs));
	}
}
