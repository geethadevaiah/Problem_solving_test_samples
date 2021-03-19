package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	
	public static List<String> generateParenFn(int n){
		List<String> result = new ArrayList<>();
		// Helper recursive
		helper(result, "",  n, n);
		return result;
	}
	
	public static void helper(List<String> result, String str, int left , int right) {
		
		if(left > right) return ;
		if(left == 0 && right == 0 ) {
			result.add(str);
			return ;
		}
		if(left > 0 ) helper(result, str+"(", left-1, right);
		if(right > 0) helper(result, str+")", left , right-1);
	}

	
	public static void main(String[] args) {
		System.out.println(generateParenFn(3)); 
	}
}
