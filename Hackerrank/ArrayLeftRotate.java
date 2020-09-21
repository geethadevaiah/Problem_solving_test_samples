package Hackerrank;

public class ArrayLeftRotate {
	public static void rotateLeft(int[] a, int d) {
		// length of the array
		int n = a.length;
		// rotate number of places till you reach the starting point
		int tmp = 0, nextIndex = 0, currIndex = 0;
		int count = 0, prev = 0;
		d = d % n ;
		d = n - d; // left rotation
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
		/*prev = a[0];
		currIndex = 0;
		while(count < n ) {
			nextIndex = (currIndex + d ) % n;
			tmp = a[nextIndex];
			a[nextIndex] = prev ;
			prev = tmp;
			currIndex = nextIndex;
			count++;
		}*/
	}
	public static void main(String[] args) {
		int[] in1 = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
		int[] in = {1,2,3,4,5};
		rotateLeft(in1, 10);
		for(int i = 0 ; i < in1.length ; i++) {
			System.out.println(in1[i]);
		}
	}
}
