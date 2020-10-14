package Arrays;

public class DiagonalTraverse {
	
	 public int[] findDiagonalOrder(int[][] matrix) {
	        
		// Check for empty matrices
	        if (matrix == null || matrix.length == 0) {
	            return new int[0];
	        }
	        
	        // Variables to track the size of the matrix
	        int N = matrix.length;
	        int M = matrix[0].length;
	        
	        // The two arrays as explained in the algorithm
	        int[] result = new int[N*M];
	        int k = 0;
	        
	        int row = 0, col = 0;
	        int direction = 1;
	        
	        while(row < N && col < M) {
	        	// adding the first element
	        	result[k++] = matrix[row][col];
	        	
	        	// if direction is 1 then moving upward.. along the diagonal so [i,j] -> [i-1, j+1]
	        	int new_row = row + (direction == 1 ? -1 : 1);
	        	int new_col = col + (direction == 1 ? 1 : -1);
	        	
	        	// check whether they are in bounds
	        	if(new_row < 0 || new_row == N || new_col < 0 || new_col == M) {
	        		
	        		// change the direction if it is out of bound
	        		if(direction == 1) { // dont tamper the new row & cols
	        			// upward.. means this is the tail
	        			// check whether the col len has been finished
	        			row = row + (col == M-1 ? 1 : 0);
	        			col = col + (col < M-1 ? 1 : 0);
	        		}
	        		else {
	        			col = col + (row == N-1 ? 1 : 0);
	        			row = row + (row < N-1 ? 1 : 0);
	        		}
	        		// flip the direction since it has reached the end of the tail matrix
	        		direction = 1 - direction;
	        	}
	        	else {
	        		// if not out of bound then make this as actual row & col
	        		row = new_row;
	        		col = new_col;
	        	}
	        }
	        return result;
	    }
}
