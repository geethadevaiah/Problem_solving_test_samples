package DP;

public class ContainerWithMostWater {

	public static int maxArea(int[] height) {
		// brute force
		int maxArea = 0, n = height.length;
		/*for(int i = 0 ; i < n ; i++)
			for(int j = i + 1; j < n ; j++) 
				maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));*/
		
		// greedy method
		int first = 0, last = n-1;
		while(first <= last) {
			maxArea = Math.max(maxArea, Math.min(height[first], height[last]) * (last - first));
			if(height[first] < height[last]) first++;
			else last--;
		}
		return maxArea;
	}
	
	public static void main(String[] args) {
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}

}
