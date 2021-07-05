package Class_revision.Recursion_and_Backtracking;

import java.util.HashSet;
import java.util.Set;

public class PermutationsOfAString {

	public static void printPermutations(String str, String perm) {
		
		if(str.length() == 0) {
			System.out.println(perm);
			return ;
		}
		// take the first character and perform permutation on the rest
		for(int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			// remaining of the string
			String ros = str.substring(0, i) + str.substring(i + 1);
			// Attach the extracted character to the perm string
			printPermutations(ros, perm + ch);
		}
	}
	
public static void printPermutationsDup(String str, String perm) {
		
		if(str.length() == 0) {
			System.out.println(perm);
			return ;
		}
		Set<Character> s = new HashSet<Character>();
		char ch = 0 ;
		
		// take the first character and perform permutation on the rest
		for(int i = 0 ; i < str.length() ; i++) {
			if(!s.remove(ch)) {
				ch = str.charAt(i);
				s.add(ch);
				// remaining of the string
				String ros = str.substring(0, i) + str.substring(i + 1);
				// Attach the extracted character to the perm string
				printPermutations(ros, perm + ch);
			}
		}
	}
	
	public static void main(String[] args) {
		printPermutations("AAC", "" );
	}
}
