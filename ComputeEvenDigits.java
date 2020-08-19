class Solution {
    public static int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int i = 0 ; i < nums.length ; i++){
            String str = String.valueOf(nums[i]);
            if(str.length() % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }

    public static void main(String[] args) {
        int[] inputarr = {1246,1,34,12,998};
        System.out.println(findNumbers(inputarr));
    }
}