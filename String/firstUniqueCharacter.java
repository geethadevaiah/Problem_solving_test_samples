package String;

import java.util.HashMap;
import java.util.Map;

public class firstUniqueCharacter {
	public static int firstUniqChar(String s) {
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0 ; i < s.length() ; i++) {
        	char c = s.charAt(i);
        	if(map.containsKey(c)) {
        		// map contains this key, update the count
        		map.put(c, map.get(c)+1);
        	}
        	else {
        		map.put(c, 1);
        	}
        }
		// find the one with the count 1
		for(int i =0 ; i < s.length() ; i++) {
			if(map.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
		
		
		/** check this **/
/*		int[] arr = new int[26];
        for(char a : s.toCharArray()){
            arr[a-'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(arr[a-'a'] == 1){return i;}
        }
        return -1;*/
    }
	
	public static void main(String[] args) {
		System.out.println(firstUniqChar("loveleetcode"));
	}
}
