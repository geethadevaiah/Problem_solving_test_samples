package Class_revision.Recursion_and_Backtracking;

import java.util.BitSet;
import java.util.List;

/**
 * Find the number of ways Queens can be placed
 * 
 * Using bitset
 * 
 * @author Geetha
 *
 */
public class NQueen_bitset {

	// defining the col bitset, left diagonal and right diagonal
	static BitSet col = new BitSet(100), ld = new BitSet(100), rd = new BitSet(100);	
	static int ans = 0;
	
	// for display purpose 
	static boolean[][] grid = new boolean[10][10];
	/**
	 * @param n
	 * @param cr - current row
	 */
	public static int nQueenCountUsingBitset(int n, int cr, boolean[][] grid) {
		// base case
		if(n == cr) {
			ans++;
			printQueensboard(n, grid);
			System.out.println();
			return ans;
		}
		// else check whether the bit sets are set in the current row and col
		for(int c = 0 ; c < n ; c++) { // check for each column in the loop
			
			/**
			 * Col bitset -> shows whether or not the column is already occupied
			 * ld bitset -> the array is between [-3,-2,-1,0,1,2,3]
			 * 			i.e by (row-col) so to do 0th index add (n-1)
			 * rd bitset -> the is array [0,1,2,3,4,5,6]
			 * 			i.e by (row+col)
			 */
			
			if(!col.get(c) & !ld.get(cr-c+n-1) & !rd.get(cr+c)) {
				col.set(c, true);
				ld.set(cr-c+n-1, true);
				rd.set(cr+c, true);
				grid[cr][c] = true;
				nQueenCountUsingBitset(n, cr+1, grid);
				col.set(c, false);
				ld.set(cr-c+n-1, false);
				rd.set(cr+c, false);
				grid[cr][c] = false;
			}
			
		}
		return ans;
	}
	
	public static void printQueensboard(int n , boolean[][] grid) {
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(!grid[i][j]) System.out.print(" . ");
				else
					System.out.print(" Q ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		int n = 5;
		//col.set(0, 4); // sets the bits to true
		System.out.println(nQueenCountUsingBitset(n, 0, grid));
	}
}
