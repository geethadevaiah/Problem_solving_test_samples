package Hackerrank;

public class ArrayLeftRotate {
	public static void rotateLeft(int[] a, int d) {
		// length of the array
		int n = a.length;
		// rotate number of places till you reach the starting point
		int tmp = 0, nextIndex = 0, currIndex = 0;
		int count = 0, prev = 0;
		for(int start = 0 ; count < n ; start++) {
			prev = a[start];
			currIndex = start;
			do {
				nextIndex = (currIndex + d ) % n;
				tmp = a[nextIndex];
				a[nextIndex] = prev ;
				prev = tmp;
				currIndex = nextIndex;
				count++;
			}while(start != currIndex);
		}
	}
}
