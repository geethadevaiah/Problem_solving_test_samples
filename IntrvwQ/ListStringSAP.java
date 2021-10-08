package IntrvwQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListStringSAP {

	/**
	 * given list of Strings
	 * ["duel", "speech", "spchee", "dleu", "cheesp", "eldu"]
	 * 
	 * arrange all the anagrams together
	 * [["duel", "dleu", "eldu"], ["speech", "spchee", "cheesp"]]
	 * 
	 * @param args
	 */
	
	
//	public static boolean isAnagram(String s1, String s2) {
//		char[] toChar1 = s1.toCharArray();
//		char[] toChar2 = s2.toCharArray();
//		
//		Arrays.sort(toChar1);
//		Arrays.sort(toChar2);
//		
//		if(Arrays.equals(toChar1, toChar2))
//			return true;
//		return false;
//	}
	
	public static void arrangeLists(List<String> list) {
		
		Map<String, List<String>> map = new HashMap<>();
		
		for(String str : list) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String key = String.valueOf(ch);
			if(!map.containsKey(key)) 
				map.put(key, new ArrayList<>());
			map.get(key).add(str);
		}
		System.out.println(map.values());
	}
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("duel");
		list.add("speech");
		list.add("spchee");
		list.add("dleu");
		list.add("cheesp");
		list.add("eldu");
		arrangeLists(list);
	}
}
