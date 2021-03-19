package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsPhoneNumbers {

	public static List<String> letterCombinationsFn(String digits) {
		
		List<String> result = new ArrayList<String>();
		
		Map<Character, String> map = new HashMap<Character, String>() {{
			put('2',"abc");
			put('3',"def");
			put('4', "ghi");
			put('5',"jkl");
			put('6',"mno");
			put('7',"pqrs");
			put('8',"tuv");
			put('9',"wxyz");}};
		
		// finish the first conditions
		if(digits == null || digits.length() == 0) {
			return result;
		}
	
		char[] arr = new char[digits.length()];
		// helper recursive function
		helper(digits, 0, map, result, arr);
		return result;
	}
	
	public static void helper(String digits, int index, Map<Character, String> map, List<String> result, char[] arr) {
		
		if(index == digits.length()) {
			result.add(new String(arr));return;
		}
		char digit = digits.charAt(index);
		char[] charArray = map.get(digit).toCharArray();
		for(int i = 0 ; i < charArray.length ; i++) {
			arr[index] = charArray[i];
			helper(digits, index+1, map, result, arr);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(letterCombinationsFn("53"));
	}

}
