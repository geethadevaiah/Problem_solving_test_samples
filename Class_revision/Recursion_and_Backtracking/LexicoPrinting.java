package Class_revision.Recursion_and_Backtracking;

public class LexicoPrinting {

	public static void lexico(int n, int i) {
		
		// base case
		if(i > n) return;
		System.out.println(i);
		// 1, 10, 11, 12, 13,
		// only when i is 0 j should start with 1, else j starts with 0 n loop till 9 
		for(int  j = (i == 0)? 1 : 0 ; j <= 9 ; j++) 
			lexico(n, 10*i+j);
	}
	
	
	public static void main(String[] args) {
		
		// print the number  from 0 to n in lexicographical order
		//  dictionary order or alphabetical order
		/**
		 * For example, using the natural order of the integers, 
		 * the lexicographical ordering on the subsets of three elements of S = {1, 2, 3, 4, 5, 6} is
		 * 123 < 124 < 125 < 126 < 134 < 135 < 136 < 145 < 146 < 156 < 234 < 235 < 236 < 245 < 246 < 256 < 345 < 346 < 356 < 456.
		 * 
		 */
		
		lexico(100, 0);
	}
}
