package BinarySearch;

public class FindMinInRotatedSortedArray {
	public static int findMin(int[] nums) {
		// find the pivot.. i.e. where the array is rotated
		int left = 0, right = nums.length-1;
		
		while(left < right) {
			int mid = left + (right - left) / 2;
			if(nums[mid] > nums[right]) left = mid+1;
			else right = mid;
		}
		return nums[left];
	}
	public static void main(String[] args) {
		int[] in = {3,4,5,1,2};
		System.out.println(findMin(in));
	}
}
