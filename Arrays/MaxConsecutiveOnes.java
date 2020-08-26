package Arrays;

class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0; 
        int maxCount = 0; 
        int n = nums.length;
        
        for (int i = 0; i < n; i++){
            // Set count to 0 when 0 is found 
            if (nums[i] == 0) {
                count = 0; 
            }
            else { 
                // increment count when 1 is found
                count++;
                maxCount = Math.max(maxCount, count); 
            } 
        }      
        return maxCount; 
    }

    public static void main(String[] args) {
        int[] inputarr = {1,0,0,0,1};
        System.out.println(findMaxConsecutiveOnes(inputarr));
    }
}