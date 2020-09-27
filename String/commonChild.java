package String;

import java.util.HashMap;
import java.util.Map;

public class commonChild {

	public static int getTheCommonChild(String s1, String s2) {

		int count = 0;
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();

		for(int i = 0; i < s1.length() ; i++) 
			map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i), 0)+1);
		for(int i = 0; i < s2.length() ; i++) 
			map1.put(s2.charAt(i), map2.getOrDefault(s2.charAt(i), 0)+1);
		
		int len = map1.size() > map2.size() ? map1.size() : map2.size();
		for(int i = 0 ; i < len ; i++) {
			if(map.)
		}
 		
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(getTheCommonChild("SHINCHAN", "NOHARAAA"));
	}
}
