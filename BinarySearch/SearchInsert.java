package BinarySearch;

public class SearchInsert {
	// main binary search function
	public static int search(int[] nums, int target) {
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
        return left;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int target = 2;
		System.out.println(search(nums, target));
	}
}
