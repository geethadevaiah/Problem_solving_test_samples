class APAS01 {
    public static void main(String[] args) {
        System.out.println("Hello, World.");
        int[]  nums = {1,2,3,4,5};
        int target = 9;
        System.out.println(twoSum(nums, target));
        
    }

    public static int[] twoSum(int[] nums, int target){
        for (int i =0 ; i < nums.length ; i++){
            for(int j=i+1; j< nums.length ;j++){
                if(nums[i]+nums[j] == target){
                    System.out.println("Returning this array indices? ["+i+" "+j+"]");
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}