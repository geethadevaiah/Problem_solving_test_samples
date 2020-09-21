package BinarySearch;

public class FindPeakElement {

	public static int peakElement(int[] nums) {
		int left = 0, right = nums.length;
		while(left < right) {
			int mid = left + (right - left)/2;
			if(nums[mid] > nums[mid+1] && nums[mid] >nums[mid-1]) {
				return mid;
			}
			if(nums[mid] < nums[mid+1]) {
				left = mid + 1;
			}
			else
				right = mid;
		}
		return -1;
	}
}
