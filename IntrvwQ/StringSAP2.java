package IntrvwQ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringSAP2 {

	/**
	 * Given s1 = 'abcdefgh'
	 * s2 = 'dec'
	 * 
	 * find whether the anagram of s2 is present in s2 (continuous -> substring)
	 * 
	 * @param args
	 */
	
	
	public static void findAnagram(String s1, String s2) {
		
		int n = s1.length(), m = s2.length();
		if(m>n) return;
		
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();
		for(int i = 0 ; i < m ; i++)
			set1.add(s2.charAt(i));
		for(int i = 0 ; i < n ; i++) {
			set2 = new HashSet<>();
			int k = m;
			while(k>0 && i+k < n) {
				set2.add(s1.charAt(i+k)); k--;
			}
//			System.out.println("set2 ?? "+set2);
			if(set2.containsAll(set1)) {
				System.out.println("anagram exists");
				return;
			}
		}
		System.out.println("There is no anagram");
	}
	
	public static void main(String[] args) {
		String s1 = "abcdefghij";
		String s2 = "dec";
		findAnagramWithMap(s1, s2);
	}
	
	public static void findAnagramWithMap(String s1, String s2) {
		int n = s1.length(), m = s2.length();
		if(m>n) return;
		
		//Using hashmap to store each of the count of the characters
		Map<Character,Integer> set1 = new HashMap<>();
		Map<Character,Integer> set2 = new HashMap<>();
		for(int i = 0 ; i < m ; i++)
			set1.put(s2.charAt(i), set1.getOrDefault(s2.charAt(i), 0)+1);
		for(int i = 0 ; i < n ; i++) {
			set2 = new HashMap<>();
			int k = m;
			while(k>0 && i+k < n) {
				set2.put(s1.charAt(i+k), set2.getOrDefault(s1.charAt(i+k), 0)+1);
				k--;
			}
			System.out.println("set2 ?? "+set2);
			// check the map contents
			if(set2.equals(set1)) {
				System.out.println("anagram exists");
				return;
			}
		}
		System.out.println("There is no anagram");
	}
}
