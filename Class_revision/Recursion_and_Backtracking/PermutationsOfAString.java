package Class_revision.Recursion_and_Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
	
	
/**
 * Print permutations to avoid duplicates
 * 
 * @param str
 * @param perm
 */
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
				printPermutationsDup(ros, perm + ch);
			}
		}
	}
	

	/**
	 * 
	 * method to return the list of permutations
	 * recursive
	 * 
	 * @param args
	 */


	public static void permutationList(String str, String perm, List<String> list){
		
		if(str.length() == 0) {
			// now the str one permutation is formed so add to the list
			list.add(perm);
			return;
		}
		
		
	}
	
	public static void main(String[] args) {
		printPermutationsDup("AAC", "" );
		
		// get the list of Permutation Strings
		permutationList("AAC", "", new ArrayList<String>());
	}
}
