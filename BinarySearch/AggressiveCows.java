package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {

	public static boolean isValid(int[] arr, int c , int dist) {
		
		// set the last position for the first element
		int lastpos = arr[0];
		// count is 1, one cow is already placed at the lastpos
		int count = 1;
		
		for(int i = 1 ; i < arr.length ; i++) {
			// check if current element in loop - lastpos is >= dist
			if(arr[i] - lastpos >= dist) {
				// place the cow at ith 
				// means increase the count
				count++;
				// update the lastpo to the curr element
				lastpos = arr[i];
			}
			// if all cows are placed return that true valid
			if(count == c) return true;
		}
		// could not place all the cows in the stalls
		return false;
	}
	
	
	public static int largestMinDistance(int n, int c, int[] arr) {
		
		int res = 0;
		// sort the array and apply binary search technique to find the range dist
		Arrays.sort(arr);
		// real numbers.. stalls not indexes.. so starts from 1 till 5
		int low = 1, high = arr.length;
		while(low <= high) {
			// find mid
			int mid = low + (high - low)/2;
		
			// check whether mid dist is enough to place all the cows
			if(isValid(arr, c, mid)) {
				// mid is valid, so maybe it can be placed at much higher distance
				// so the right slot
				// change low to mid + 1 
				low = mid + 1;
				// lower bound.. at least once all cows could be placed..
				// so set the result to return 
				res = mid;
			}
			else {
				// if not distance has be less than mid
				// decrease the high range to mid - 1
				high = mid - 1;
			}
		}
		return res;
		
	}
	
	public static void main(String[] args) {
		int n = 5;// Number of stalls
		int c = 3; // Number of cows
		int[] arr = {1,2,8,4,9}; // stalls
		
		System.out.println(largestMinDistance(n,c,arr));
		
	}
}
