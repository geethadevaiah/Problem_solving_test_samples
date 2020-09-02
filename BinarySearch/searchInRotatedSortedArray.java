package BinarySearch;

public class searchInRotatedSortedArray {

	public int search(int[] nums, int target) {
        // find pivot.. position where the tail ends (greatest number of the array)
		int pivot = findPivot(nums, 0, nums.length - 1);
		// if pivot is not found then it is not cyclic array
		if(pivot == -1)
			return binarySearch(nums, target, 0 , nums.length-1);
		
		if(nums[pivot] == target)
			return pivot;
		if(nums[pivot] <=  target)
			return binarySearch(nums,0, pivot -1 , target);
		return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }
	
	public static int findPivot(int[] nums, int left, int right) {
		// meet the conditions first
		if(left > right) return -1;
		// check whether both are equal..
		if(left == right) return left;
		
		int mid = left + (right - left)/ 2;
		if (mid < right && nums[mid] > nums[mid + 1])
			return mid;
		if(mid > left && nums[mid] < nums[mid - 1]) 
			return (mid - 1);
		if(nums[left] >= nums[mid])
			return findPivot(nums, left, mid - 1);
		return findPivot(nums,mid + 1 , right);
		
	}
	public int binarySearch(int[] nums, int target, int l, int r) {
		// left , right and mid pivot element
        int pivot, left = l, right = r ;
        // check whether left pointer does not cross over the right pointer
        while(left <= right){
        	// this is the mid point
            pivot = (left + right) / 2;
            // if the number matches the target
            if(nums[pivot] == target) 
            	// return the index 
            	return pivot;
            // update the right or left index
            if(target < nums[pivot]) right = pivot - 1;
            else 
                left =pivot + 1;
        }
        // target not found
        return -1;
    }
	
}
