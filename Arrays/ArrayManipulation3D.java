package Arrays;

import java.util.Arrays;

public class ArrayManipulation3D {
	
	public static long arrMan(int n , int [][] queries) {
		// Dynamic Programming
		// add the k value at index a
		// subtract k at index b+1.. find max
		
		long[] arrMan = new long[n+2];
		for(int i = 0 ; i < queries.length ; i++) {
			arrMan[queries[i][0]] += queries[i][2];
			// find the b index less than n to avoid out of bound
			//if(queries[i][1]+1 < n) { // subtract the k value
				arrMan[queries[i][1]+1] -= queries[i][2];
			//}
		}
		long maxV = Long.MIN_VALUE, x = 0;
		// add each value in the array. find the max
		for(int i = 0 ; i < n+2 ; i++) {
			x += arrMan[i];
			maxV = Math.max(maxV, x);
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
//		System.out.println("MAX v ? "+arrMan(10, q));
		int[][] q1 = {
				{2, 3, 603},
				{1, 1, 286},
				{4, 4, 882}};
		System.out.println(arrMan(4, q1));
		
	}
}
