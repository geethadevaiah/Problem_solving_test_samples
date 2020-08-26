package Arrays;

import java.util.Arrays;

public class ThirdMax {

	
	public static int thirdMax(int[] nums) {
		Arrays.sort(nums);
		int n = removeDuplicates(nums);
		for(int i =0 ; i < n ; i++) {
			System.out.println(nums[i]);
		}
		if(n >= 3)
			return nums[n - 3];
		else if(n == 2)
			return nums[1];
		else if(n == 1)
			return nums[0];
		else
			return 0;
		
	}
	public static void main(String[] args) {
		int[] A = {3,1,2,2};
		System.out.println(thirdMax(A)); 
	}
	public static int removeDuplicates(int[] nums) {
			int i = 0;
			int j = i + 1;
			while(j < nums.length) {
				if(nums[i] != nums[j]) {
					nums[++i] = nums[j];
				}
				j++;
			}
			return i + 1;
		}
}
