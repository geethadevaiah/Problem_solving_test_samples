package Hackerrank;

public class HourGlassProblem {

	public static int hourGlassSum(int[][] arr) {
		// find the highest sum of hourglass in the matrix
		/**
		 * 
		 *  1 1 1 0 0 0
			0 1 0 0 0 0
			1 1 1 0 0 0
			0 0 2 4 4 0
			0 0 0 2 0 0
			0 0 1 2 4 0
			
			output : 19
		 */
		
		// get the max size to which the glass has to move
		int row = arr[0].length - 3;
		int height = arr.length - 3;
		
		int total = Integer.MIN_VALUE;
		for(int i = 0 ; i <= row ; i++) {
			for(int j = 0 ; j <= height; j++) {
				// get the first row of the hour glass
				int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2];
				System.out.println("sum now ? "+sum);
				// get the middle row
				sum += arr[i+1][j+1];
				System.out.println("sum afte second row"+sum);
				// get the last row of the hour glass
				sum += arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				System.out.println("sum after third row"+sum);
				// if the sum is greater than previous sum calculated replace it!
				System.out.println("total n sum is : "+total+"  "+sum);
				if(sum > total)
					total = sum;
			}
		}
		return total;
		
		
		
		}
}
