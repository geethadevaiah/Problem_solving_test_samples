package Arrays;

import java.util.Arrays;

public class ArrayManipulation3D {
	
	public static long arrMan(int n , int [][] queries) {
		int maxV = Integer.MIN_VALUE;
		int low = queries[0][0], high = queries[0][1] , k = queries[0][2];
		int x = 1;maxV = Math.max(maxV, k);
		while(x < queries.length) {
			low = queries[x][0];
			if(low <= high) {
				maxV = Math.max(maxV, maxV+queries[x][2]);
			}
			high = queries[x++][1];
		}
		
		return maxV;
	}
	
	/*public static long arrMan(int n , int [][] queries) {// checking with only 1D array
		int[] arrMan = new int[n];
		for(int x = 0 ; x < queries.length - 1 ;x++) 
			for(int i = 0 ; i < n ; i++)
				if(i >= queries[x][0] && i <= queries[x][1]) 
					arrMan[i] +=  queries[x][2];
		Arrays.sort(arrMan);
		return arrMan[arrMan.length-1];
	}*/
	
	/*public static long arrMan(int n , int [][] queries) {
		int[][] arrMan = new int[queries.length+1][n+1];
		long maxV = 0;
		for(int i = 1 ; i <= queries.length ; i++) {
			// get the queries first row here
			// get the [] range to add in the res [][] arr
			int low = queries[i-1][0], high = queries[i-1][1], k = queries[i-1][2];
			for(int j = 0 ; j < n ; j++) {
				if( j+1 >= low && j+1 <= high ) {
					arrMan[i][j] = arrMan[i-1][j] + k;
					maxV = Math.max(maxV, arrMan[i][j]);
				}
				else arrMan[i][j] = arrMan[i-1][j];
				System.out.print(arrMan[i][j]+" ");
			}
			System.out.println();
		}
		return maxV;
	}*/
	
	public static void main(String[] args) {
		int[][] q = {{1,5,3},
		             {4,8,7},
		             {6,9,1}};
		System.out.println("MAX v ? "+arrMan(10, q));
		
	}
}
