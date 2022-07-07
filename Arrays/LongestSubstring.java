package Arrays;
import java.util.HashMap;
import java.util.Map;

class LongestSubstring {
    public static void main(String[] args) {
        String inputStr = "dvshiuvrwgnvdrgdf";
         System.out.println("Longest substring in the input is ? "+longSubstr(inputStr));
        System.out.println("Checking with the other function 1? "+lengthOfLongestSubstring1(inputStr));
        // System.out.println("Checking with the other function 2? "+lengthOfLongestSubstring2(inputStr));
    }    

    // find the longest substring
    public static String longSubstr(String inputStr) {
        String substringStr = "";
        String finalStr = "";
        for(int i = 0 ; i < inputStr.length() ; i++){
            String pivotelem = inputStr.charAt(i)+"";
            if(!substringStr.contains(pivotelem)){
                substringStr += pivotelem;
            }
            else{
                // found the element in the substring 
                // find the position where it exists
                
                if(substringStr.length() > finalStr.length())
                    finalStr = substringStr;
                substringStr=pivotelem;
            }
        }
        return finalStr.length()>substringStr.length() ? finalStr : substringStr;
    }

    // Provided solution 1
    // for finding the longest substring length 
    public static int lengthOfLongestSubstring1(String s){
        int  n = s.length(), ans = 0;
         int[] index = new int[128];// current index of character
         // try to extend the range  [i, j]
         for (int j = 0, i = 0; j < n ; j++){
             System.out.println("what is the answer index ??? "+index[s.charAt(j)]+"   "+s.charAt(j));
             i = Math.max(index[s.charAt(j)], i);
             ans = Math.max(ans, j - i + 1);
             index[s.charAt(j)] = j + 1;
         }
         return ans;
    }

    // Provided solution 2
    // to find the length of longest substring length
    public static int lengthOfLongestSubstring2(String s){
        int n = s.length(), ans= 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int j = 0 , i = 0; j < n ; j++){
            if(map.containsKey(s.charAt(j))){
            	// if the char is already present in map
            	// then take i from next index of that
                i = Math.max(map.get(s.charAt(j)), i);
            }
            // get the max of the curr index or previously found
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j+1);
        }
        return ans;
    }
    
    // easier way
    public static int longestSubstring(String s) {
    	int ans = 0;
    	
    	// keep acquiring the characters till the substring is valid
    	// release the characters till the substring in invalid
    	// validation is by checking with the map character count being greater than 1
    	
    	Map<Character, Integer> map = new HashMap<Character, Integer>();
    	int i = -1, j = -1; // no characters included
    	
    	while(true) {
    		boolean f1 = false, f2 = false; // if no loop has been entered
    		
    		//acquire
    		while(i < s.length() - 1) {	// acquire till there are characters in the string to work on
    			f1 = true;
	    		i++;
	    		char ch = s.charAt(i);
	    		map.put(ch, map.getOrDefault(ch, 0) + 1);
	    		// if at any time this count becomes greater than 1 , then it is not valid
	    		if(map.get(ch) == 2) { // not valid
	    			break;
	    		} else {
	    			int len = i - j;
	    			if(len > ans)
	    				ans = len;
	    		}
    		}
    		// release
	    	while(j < i) { // keep releasing till the second pointer crosses the first pointer
	    		f2 = true;
	    		j++;
	    		char ch = s.charAt(j);
	    		map.put(ch, map.get(ch) - 1);
	    		if(map.get(ch) == 1) { // valid
	    			break;
	    		}
	    	}
	    	if(f1 == false && f2 == false)
	    		break;
    	}
    	return ans;
    	// valid and not valid revolves around the character count being 1 or 2.. so no other validations are used
    }
}