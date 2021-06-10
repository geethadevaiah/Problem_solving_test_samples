package DP;

public class NQueensSolution {

	
	static int[][] queens = {{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0}};
	
	
	// placing in the index will be indicated as the queen is placed at that index
	
	public static void displayNqueensSolution() {
		
		// this function will only print out the matrix solution of the nqueens problem
		for(int i = 0 ; i < 4; i++) {
			for(int j = 0 ; j < 4 ; j++) {
				System.out.print(queens[i][j]+ " ");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}
	
	public static boolean nqueenIsSafe(int[][]queens, int r, int c) {
		
		// check for the col
		for(int i = 0 ; i < 4 ; i++) 
			if(queens[i][c] == 1) return false;
		// left diagonal
		for(int i = r, j = c ; i >=0 && j>= 0 ; i--,j--)
			if(queens[i][j] == 1) return false;
		// right diagonal
		for(int i = r, j = c ; i >=0 && j < 4; i--,j++)
			if(queens[i][j] == 1) return false;
		
		return true;
	}
	
	public static void nQueenSolution(int[][] queens, int r) {
		
		if(r == 4) {
			// reached the end of the array 
			displayNqueensSolution();
		}
		
		for(int i = 0 ; i < 4 ; i++) {
			if(nqueenIsSafe(queens, r, i)) {
				queens[r][i] = 1;
				nQueenSolution(queens, r+1); // hitting for next row
				queens[r][i] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		
		nQueenSolution(queens, 0);
	}
}
