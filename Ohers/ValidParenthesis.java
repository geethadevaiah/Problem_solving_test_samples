package Ohers;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
	public static boolean validParam(String s) {
		
		if(s.length() < 2) return false;
		
		Map<Character, Character> map = new HashMap<>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0 ; i < s.length() ; i++) {
			if(map.containsKey(s.charAt(i))) {
				// pop from the stack
				char c = map.get(s.charAt(i));
				char r = stack.isEmpty() ? '#' : stack.pop();
				if(r != c) return false;
			}
			else
				stack.push(s.charAt(i));
		}
		return stack.isEmpty();
	}
}
