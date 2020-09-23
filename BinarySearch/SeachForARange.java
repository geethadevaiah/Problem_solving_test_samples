package BinarySearch;

public class SeachForARange {
	// returns left or right index range acc to the 3rd arg set to true or false resp..
    private static int extremeLeftOrRightIndex(int[] nums, int target, boolean leftSideCheck) {
        int lo = 0, hi = nums.length;
        
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            // to be searched in left side of the array leftSideChec = left /right
            if (nums[mid] > target || (leftSideCheck && target == nums[mid])) 
                hi = mid;
            else lo = mid+1;
        }
        return lo;
    }
    
	public static int[] searchRange(int[] nums, int target) {
		// result to send
		int[] targetRange = {-1, -1};
		// finding the extreme left index of the target..
        int leftIdx = extremeLeftOrRightIndex(nums, target, true);
        // check whether or not target is present in the array
        if (leftIdx == nums.length || nums[leftIdx] != target) 
            return targetRange;
        // set the results
        targetRange[0] = leftIdx;
        targetRange[1] = extremeLeftOrRightIndex(nums, target, false)-1;
        return targetRange;
	}
	public static void main(String[] args) {
		int[] in = {1,2,3,4,4,4,4,4,5,6,7};
		int[] res = searchRange(in, 4);
		for(int i = 0 ; i < res.length ; i++) {
			System.out.print(res[i]+" ");
		}
	}
}

