package Ohers;

public class TrappingRainWater {
	
	// direct approach
	public static int findTrapWater(int[] height) {
		
		int water = 0;
		if(height.length == 0) return water;
		for(int i = 0 ; i < height.length ; i++) {
			int left = height[i]; // left 
			for(int j = 0 ; j < i ; j++) // get the max on the left side till index i
				left = Math.max(left, height[j]);
			int right = height[i];
			for(int j = i+1 ; j < height.length ; j++) // get the right max from the i index to end
				right = Math.max(right, height[j]);
			// get the min of two windows and subtract with the actual height of each bar
			water += Math.min(left,  right) - height[i];
		}
		return water;
	}
	
	
	// DP Approach
	public static int findWaterDp(int[] height) {
		
		int water = 0, n = height.length;
		if(height.length == 0) return water;
		// two arrays left, right
		int[] left = new int[n], right = new int[n];
		// Initialize first and last element of left n right
		left[0] = height[0]; right[n-1] = height[n-1];
		// fill up the left array to include the max value traversing left direction till that index
		for(int i = 1; i < n ; i++) 
			left[i] = Math.max(left[i-1], height[i]);
		// fill all the right array traversing from the right.
		for(int i = n-2; i >0 ; i--) 
			right[i] = Math.max(right[i+1], height[i]);
		// diff between current value and min of left, right arr
		for(int i = 1 ; i < n ; i++) 
			water += Math.min(left[i], right[i]) - height[i];
		return water;
	}
	
	//two pointer approach
	public static int findwaterTwoPointer(int[] height) {
		
		int water = 0 ;
		if(height.length == 0) return water;
		// two pointers
		int left = 0 , right = height.length - 1 ;
		int left_max = height[0], right_max = height[height.length - 1]; // two max value sides
		while(left < right) {// while it doesnt cross the center
			if(height[left] < height[right]) {//compare two extremes
				// update left_max if current valueis greater
				if(height[left] >= left_max) left_max = height[left];
				else water += left_max-height[left]; // else add to answer
				left++;
			}
			else {// similarly right
				if(height[right] > right_max) right_max = height[right];
				else water += right_max- height[right];
				right--;
			}
		}
		
		return water;
	}
	
	public static void main(String[] args) {
		int[] height = {0,1,0, 2, 1, 0, 1, 3, 2, 1, 2 , 1};
		System.out.println(findTrapWater(height));
		System.out.println(findWaterDp(height));
		System.out.println(findwaterTwoPointer(height));
	}
}
