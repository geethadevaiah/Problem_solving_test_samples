package BinarySearch;

import java.util.Arrays;

public class NotATriangle {

	public static int FindthePosNotATriangles(int[] arr) {
		
		int res = 0;
		
		// this proceeds with the logic that the triangle a+b >= c then triangle is possible
		// upper bound
		// apply binary search technique to eliminate the number of sides required for formation of triangle
		// sort the numbers to apply binary search technique
		
		Arrays.sort(arr);
//		int lastpos = arr[0];
		
		for(int i = arr.length - 1 ; i >= 0 ; i--) {
			int low = 0, high = arr.length-1;
			while(low < high) {
				if( arr[low] + arr[high] < arr[i]) {
					res += high -1;
					low++;
				}
				else {
					high--;
				}
			}
		}
		
		
		return res;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(FindthePosNotATriangles(arr));
	}
}
