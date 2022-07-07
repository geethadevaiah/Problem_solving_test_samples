package Ohers;

public class RotateTheArrayAtK {
	
	
	// one with brute force. Iterating through loop to rotate the array
	public static void rotate(int[] nums, int k) {
        // get the kth index from the end to rotate
		int n = nums.length;
		k = k % n ;
		if(k == 0) return ;
		int prev = 0, tmp = 0;
		for(int i = 0 ; i < k ; i++) {
			prev = nums[n - 1];
			for(int j = 0 ; j < nums.length ; j++) {
				tmp = nums[j];
				nums[j] = prev;
				prev = tmp;
			}
		}
    }
	// changing inside an array.. in circular motion k times
	public static void rotate1 (int [] nums, int k ) {
		int n = nums.length;
		k = k % n ;
		if(k == 0) return ;
		int prev = 0, currIndex = 0, temp = 0, count = 0;
		for(int start = 0 ; count < nums.length ; start++) {
			prev = nums[start];
			currIndex = start;
			// keep rotating till reach the initial point
			do {
				int nextIndex = (currIndex + k) % n;
				temp = nums[nextIndex];
				nums[nextIndex] = prev;
				prev = temp;
				currIndex = nextIndex;
				count++;
				
			} while(start != currIndex);
		}
	}
	
	public static void main(String[] args) {
		int[] in = {1,2,3,4,5,6,7};
		int k = 3;
		rotate1(in, k);
		for(int i = 0 ; i < in.length ; i++)
			System.out.println(in[i]);
		int[] in1 = {-1,-100,3,99};
		rotate1(in1, 2);
		for(int i = 0 ; i < in1.length ; i++)
			System.out.println(in1[i]);
	}
}
