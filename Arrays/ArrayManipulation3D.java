package Arrays;

public class ArrayManipulation3D {
	public static long arrMan(int n , int [][] queries) {
		int[][] arrMan = new int[n][3];
		long maxV = 0;
		for(int i = 0 ; i < 3 ; i++) {
			// get the queries first row here
			// get the [] range to add in the res [][] arr
			int low = queries[i][0], high = queries[i][1], k = queries[i][2];
			for(int j = 0 ; j <= n ; j++) {
				if( j >= low && i <= high ) {
					arrMan[i][j] = arrMan[i-1][j] + k;
					maxV = Math.max(maxV, arrMan[i][j]);
				}
				System.out.print(arrMan[i][j]+" ");
			}
			System.out.println();
		}
		return maxV;
	}
	
	public static void main(String[] args) {
		int[][] q = {{1,2,100},
		             {2,5,100},
		             {3,4,100}};
		arrMan(5, q);
		
	}
}
