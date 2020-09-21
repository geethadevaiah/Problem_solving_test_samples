package BinarySearch;

public class searchInRotatedSortedArray2 {

	public static int search(int[] nums, int target) {
		if(nums.length == 0 || nums == null) return -1;
		
		// find the pivot i.e. rotated point ( start of the original array)
		int left = 0, right = nums.length-1;
		
		while(left < right) {
			int mid = left + (right - left) / 2;
			if(nums[mid] < nums[right]) right = mid;
			else left = mid + 1;
		}
        // found the rotated point..
		int pivot = left;
		left = 0; right = nums.length - 1;
		// decide which side of the array to be searched on
		if(nums[pivot] <= target && nums[right] >= target) left = pivot;
		else right = pivot;
		
		// normal binary search
		while(left <= right) {
			int mid = left + (right - left)/2;
			if(nums[mid] == target)
				return mid;
			if(nums[mid] > target) right = mid-1;
			else left = mid+1;
		}
		return -1;
    }
	public static void main(String[] args) {
		int[] in = {4,5,6,7,0,1,2};
		System.out.println(search(in, 0));
	}
	
}
