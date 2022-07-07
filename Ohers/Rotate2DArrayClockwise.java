package Ohers;

public class Rotate2DArrayClockwise {

	/**
	 * Input: matrix = [[1,2],[3,4]]
		Output: [[3,1],[4,2]]
	 */
	public void rotate(int[][] matrix) {

		 // if matrix size is less than 2 , return
        if(matrix.length < 2)
            return;
        //size
        int n = matrix.length;
		
        // 1. fold the matrix horizontally
        for(int i = 0 ; i < n / 2 ; i++) {
			int[] tmp = matrix[i];
			matrix[i] = matrix[n-1-i];
			matrix[n-1-i] = tmp;
 		}
		
        // 2. fold the matrix diagonally
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < i ; j++) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = tmp;
			}
		}
	}
}
