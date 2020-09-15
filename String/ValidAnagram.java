package String;

public class ValidAnagram {
	 public static boolean isAnagram(String s, String t) {
	    
		 // logic is to add to map or array using one string s
		 // n decrement the count with the other string t
		 // if finally all the counts in the map/array is not
		 // 0 then it is not a valid anagram
		 
		 // or rather this is easier in JavaScript
		 /*
		  * match the length first , then
		  * s = s.split('').sort().join('')
		  * t = t.split('').sort().join('')
		  * 
		  * return s === t
		  */
		 
		 if(s.length() != t.length())
			 return false;
		 int[] schar = new int[26];
		 
		 for(int i = 0 ; i < s.length() ; i++) {
			 schar[s.charAt(i)  - 'a']++;
			 schar[t.charAt(i)  - 'a']--;
		 }
		 
		 for(int count : schar) {
			 if(count != 0) {
				 return false;
			 }
		 }
		 return true;
	 }
	 
	 public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "anagara"));
	}
}
