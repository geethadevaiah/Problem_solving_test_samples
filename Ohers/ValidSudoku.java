package Ohers;

import java.util.HashMap;

public class ValidSudoku {

	
	public static boolean isValidSudoku(char[][] board) {
		
		if(board.length != board[0].length) return false;
		
		int n = board.length;
		// initialize each hashmaps
		HashMap<Integer, Integer>[] row = new HashMap[9];
		HashMap<Integer, Integer>[] col = new HashMap[9];
		HashMap<Integer, Integer>[] block = new HashMap[9];
		
		for(int i = 0 ; i < n ; i++) {
			row[i] = new HashMap<>();
			col[i] = new HashMap<>();
			block[i] = new HashMap<>();
		}
		
		// validate the board
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				char num = board[i][j];
				if(num != '.') {
					int number = (int) num;
					int box_index = ( i / 3 ) * 3+ j/3;
//					int box_index = i+ j/3;
				
					row[i].put(number, row[i].getOrDefault(number, 0) + 1);
					col[j].put(number, col[j].getOrDefault(number, 0) + 1);
					block[box_index].put(number, block[box_index].getOrDefault(number, 0) + 1);
					
					// if any of the value is > 1, then val already there
					if(row[i].get(number) > 1 || col[j].get(number) > 1 || block[box_index].get(number) > 1)
						return false;
				}
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		char[][] b = {{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				{'.','9','8','.','.','.','.','6','.'},
				{'8','.','.','.','6','.','.','.','3'},
				{'4','.','.','8','.','3','.','.','1'},
				{'7','.','.','.','2','.','.','.','6'},
				{'.','6','.','.','.','.','2','8','.'},
				{'.','.','.','4','1','9','.','.','5'},
				{'.','.','.','.','8','.','.','7','9'}};
		System.out.println(isValidSudoku(b)); 
		
	}
}
