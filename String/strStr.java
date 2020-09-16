package String;
public class strStr {
	public static int getStrStr(String haystack, String needle) {
		/*if(needle.length() == 0 ) return 0;
		if(haystack.length() == 0 || needle.length() > haystack.length()) return -1;
		int i = 0 , j = 0, index = 0;
		
		while(i < haystack.length() && j < needle.length()) {
			if(haystack.charAt(i) == needle.charAt(j)) {
				if( j == 0) index = i;
				i++; j++;
			}
			else {
				i++;
				// move j steps backward n search again..
				if(j>0) i = i - j;
				j=0;
			}
		}
		// found return the index
		if(j == needle.length()) return index;
		return -1;*/
		
		
		// Approach 2 
		/*if(needle.length()==0)
            return 0;
        if(haystack.length()==0)
            return -1;
        return haystack.indexOf(needle);*/
		
		// Approach 3: good one try to figure out.
		if (needle == null || needle.length() == 0) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;
            while (haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
                if (j == needle.length()) return i;
            }
        }
        return -1;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getStrStr("mississippi","issip"));
	}
}
