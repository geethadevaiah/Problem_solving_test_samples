package Ohers;

public class SetMatrixZeroes {

	
	public static void setZeroes(int[][] matrix) {
		
		// setting only the row and col of the matrix to zero if there exists 0 in the cell
		
		// check whether the first row is 0
		boolean isCol = false;
		int R = matrix.length;
		int C = matrix[0].length;
		
		for(int i = 0 ; i < R ; i++) {
			// any row first col
			if(matrix[i][0] == 0) isCol = true;
			
			for(int j = 1 ; j < C ; j++) {
				if(matrix[i][j] == 0) {
					matrix [i][0] = 0; // set the first col 0
					matrix[0][j] = 0;// set the first row 0
				}
			}
		}
		
		// update the matrix based on the row & col values now
		for(int i = 1 ; i < R ; i++) {
			for(int j = 1 ; j < C ; j++) {
				if(matrix[i][0] == 0 | matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		
		
		// check if the first row needs to be set to 0 as well
		if(matrix[0][0] == 0) {
			for(int i = 1; i < C ; i++) {
				matrix[0][i] = 0;
			}
		}
		
		// check if the col also needs to be 0
		if(isCol) {
			for(int i = 1; i < R ; i++) {
				matrix[i][0] = 0;
			}
		}
		for(int i = 0 ; i < R ; i++)
			for(int j = 0 ; j < C ; j++)
				System.out.println(matrix[i][j]);
	}
	
	public static void main(String[] args) {
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(matrix);
	}
}
