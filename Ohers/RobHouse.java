package Ohers;

public class RobHouse {
	public static int rob(int[] nums) {
        int dp1 = 0, dp2 = 0, max_amount = 0;
        for(int num: nums) {
            max_amount = Math.max(dp2, num + dp1);
            dp1 = dp2;
            dp2 = max_amount;
        }
        return max_amount;
    }
    
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
		int[] in = {2,1,1,2};
		System.out.println(rob(in));
	}
}
