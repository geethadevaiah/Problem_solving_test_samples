import java.util.HashMap;
import java.util.Map;

class LongestSubstring {
    public static void main(String[] args) {
        String inputStr = "dvdf";
        // System.out.println("Longest substring in the input is ? "+longSubstr(inputStr));
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
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j+1);
        }
        return ans;
    }
}