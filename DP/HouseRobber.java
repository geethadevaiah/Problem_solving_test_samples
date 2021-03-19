package DP;

public class HouseRobber {
	
	public static int houseRobberFn(int[] nums) {
		
		if(nums.length == 0) return 0; // no house
		if(nums.length == 1) return nums[0]; // only one house

		// store the value stolen after completing each house
		int[] house = new int[nums.length];
		house[0] = nums[0]; // only first house.. no choice take all treasure at first
		house[1] = Math.max(nums[1], nums[0]); // choice between 1 , 2 house.. take the max
		
		for(int i = 2 ; i < nums.length ; i++) {
			// at each level, choice between previous alternate (-2) + current house 
			// OR the last house which is the max
			house[i] = Math.max(house[i-2]+nums[i], house[i-1]) ;
		}
		return house[house.length - 1];
	}
	
	
	public static void main(String[] args) { 
		int[] nums= {1, 3, 4, 4, 3, 3, 7, 2, 3, 4, 5, 1};
		System.out.println(houseRobberFn(nums));
	}

}
