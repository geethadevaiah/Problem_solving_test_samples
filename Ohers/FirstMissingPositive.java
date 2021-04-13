package Ohers;

import java.util.Arrays;

public class FirstMissingPositive {
	
	public static int firstMissingPosNum(int[] nums) {
		
		if(nums.length == 0 || nums == null)
		return 1;
		int posNum = 1;
		Arrays.sort(nums);
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] == posNum) posNum++;
		}
		
		return posNum;
		
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(firstMissingPosNum(nums));
	}
}
