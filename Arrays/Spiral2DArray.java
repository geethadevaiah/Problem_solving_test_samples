package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Spiral2DArray {
	public static List < Integer > spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<Integer>();
        if (matrix.length == 0)
            return ans;
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) ans.add(matrix[r1][c]);
            for (int r = r1 + 1; r <= r2; r++) ans.add(matrix[r][c2]);
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) ans.add(matrix[r2][c]);
                for (int r = r2; r > r1; r--) ans.add(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ans;
    }
	
	public static void main(String[] args) {
		
		int[][] matrix = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}};
		
		System.out.println(mySpiralOrder(matrix));
	}
	
	
	
	public static List<Integer> mySpiralOrder(int[][] matrix){
		List<Integer> result = new ArrayList<Integer>();
		
		if(matrix.length == 0) {
			return result;
		}
		/***
		 * r1 c1, , , , , , r1 c2 
		 * ,
		 * ,
		 * ,
		 * r2 c1, , , , , , r2 c2
		 */
		// defining rows and columns .. 0 to length of the matrix
		int r1 = 0, r2 = matrix.length-1;
		int c1 = 0, c2 = matrix[0].length-1;
		
		while(r1 <= r2 && c1 <= c2) {
			// ------> direction
			for(int c = c1 ; c <= c2 ; c++) {
				result.add(matrix[r1][c]);
			}
			// | downwards	
			for(int r = r1+1 ; r <= r2 ; r++) {
				result.add(matrix[r][c2]);
			}
			if(r1 < r2 && c1 < c2) { 
				// <------------ direction
				for(int c = c2-1 ; c > c1 ; c--) result.add(matrix[r2][c]);
				/// | upward direction 
				for(int r = r2 ; r > r1 ; r--) result.add(matrix[r][c1]);
			}
			r1++;c1++;
			r2--;c2--;
		}
		return result;
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
