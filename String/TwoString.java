package String;

import java.util.HashMap;
import java.util.Map;

//check if two substring have at least one char in common
public class TwoString {
	public static String checkIfOneCOmmonStringExists(String s1, String s2) {
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i = 0 ; i < s1.length() ; i++) {
			if(map.containsKey(s1.charAt(i))) {
				map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
			}
			else map.put(s1.charAt(i), 1);
		}
		for(int i = 0 ; i < s2.length() ; i++) 
			if(map.containsKey(s2.charAt(i))) 
				return "YES";
		return "NO";
	}
	public static void main(String[] args) {
		String s1="apple", s2="aafdgdr";
		System.out.println(checkIfOneCOmmonStringExists(s1, s2));
	}
}
