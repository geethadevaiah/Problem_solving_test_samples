package Ohers;

public class WordClass {

	public static boolean wordSearchFun(char[][] board, String word) {
		
		if(board == null || board.length == 0) return false;
		
		int m = board.length, n = board[0].length;
		
		for(int i = 0 ; i < m ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(word.charAt(0) == board[i][j] && helper(board, word, 0 , i , j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	
	public static boolean helper(char[][] board, String word, int c, int i, int j ) {
		if(c == word.length()) return true;
		
		if(i < 0 || i >= board.length || j <0 || j >= board[0].length)
			return false;
		
        if(word.charAt(c) != board[i][j]) 
        		return false;

		//get the temp char on board
		char temp = board[i][j];
		
		// make the board entry blank to avoid repetition
		board[i][j] = ' ';
		boolean k = false;
		if( word.charAt(c) == temp) {
			k = helper(board, word, c+1, i+1, j) || helper(board, word, c+1, i , j+1) ||
					helper(board, word, c+1, i, j-1) || helper(board, word, c+1 , i-1, j);
		}
		
		// put the temp variable back to the board.
		board[i][j] = temp;
		return k;
	}
	
	public static void main(String[] args) {
		
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCE";
		System.out.println(wordSearchFun(board, word));
	}
}
