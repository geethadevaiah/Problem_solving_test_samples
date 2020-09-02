package BinarySearch;

public class binarySearch {
	// main binary search function
	public int search(int[] nums, int target) {
		// left , right and mid pivot element
        int pivot, left = 0, right = nums.length -1 ;
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


// TEMPLATE #1
// Prevent (left + right) overflow
// int mid = left + (right - left) / 2;
