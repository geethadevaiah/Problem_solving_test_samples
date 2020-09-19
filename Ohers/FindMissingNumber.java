package Ohers;

public class FindMissingNumber {
	public int missingNum(int[] nums) {
		int  missing = nums.length;
		
		// XOR operation
		// ( 2 ^2) is 0 .. so only number missing will be found
		for(int i = 0 ; i < nums.length ; i++) {
			missing = missing ^ i ^ nums[i];
		}
		return missing;
	}
}
