package Ohers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		//empty!
        if (strs.length == 0) return new ArrayList();
        // map to compare key value
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
        	// convert to array
            char[] ca = s.toCharArray();
            Arrays.sort(ca); // sort the arrays
            String key = String.valueOf(ca);
            // check if the map already contains this key n update the list
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());// add new list
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }
	
	public static void main(String[] args) {
		String[] str = {"eat","tea","tan","ate","nat","bat"}; 
		System.out.println(groupAnagrams(str));
	}
	
}
