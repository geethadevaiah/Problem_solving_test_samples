package Ohers;

public class RobHouse {
	
	public static int rob(int[] nums) {
		int n = nums.length; 
		if(n == 0) return 0; // there is no house to rob
		if(n == 1) return nums[0];// there is only one house to rob
		// initialize the house array
		int[] house = new int[nums.length];
		house[0] = nums[0]; // first house
		house[1] = Math.max(nums[0], nums[1]); //  take max
		for(int i = 2; i < n ; i++) {
			// at every step the house chosen may be
			// Max( previous house rob val ,
			// current house val + one alt previous rob val)
			// [ 1, 3, 4, 4 ]
			//   1  3  5  7
			// 1 or 3 ? 3 is bigger, so the robber will go to steal 3
			// 3 or (4 + 1) is bigger
			house[i] = Math.max(nums[i] + house[i-2], house[i-1]);
		}
		return house[n-1];
	}
	
	
	/*public static int rob(int[] nums) {
        int dp1 = 0, dp2 = 0, max_amount = 0;
        for(int num: nums) {
            max_amount = Math.max(dp2, num + dp1);
            dp1 = dp2;
            dp2 = max_amount;
        }
        return max_amount;
    }*/
    
    // Top down
    /*Integer[] dp;
    public static int rob(int[] nums) {
        dp = new Integer[nums.length];
        return rob(nums, nums.length - 1);
    }
    
    private int rob(int[] nums, int i) {
        if(i < 0) return 0;
        if(dp[i] != null) return dp[i];
        return dp[i] = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
    }*/
    
    // Recursive
    /*public static int rob(int[] nums) {
        return rob(nums, nums.length - 1);
    }
    
    private int rob(int[] nums, int i) {
        if(i < 0) return 0;
        return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
    }*/
	
	public static void main(String[] args) {
//		int[] in = {2,1,1,2};
		int[] in = {1,2,3,1};
		System.out.println(rob(in));
	}
}
