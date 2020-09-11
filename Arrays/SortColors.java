package Arrays;

/**
 * Given an array with n objects colored red, white or blue, sort them in-place
 * so that objects of the same color are adjacent, with the colors in the order
 * red, white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white,
 * and blue respectively.
 * 
 * Note: You are not suppose to use the library's sort function for this
 * problem.
 *
 */
//Input: [2,0,2,1,1,0] Output: [0,0,1,1,2,2]
public class SortColors {

	public static void sortColors(int[] nums) {
		// get three pointers
		// one to begin.. one the cursor.. n the last one for highestnumbers
		int l = 0, i = 0, r = nums.length - 1;
		// 3 cases.. 0 , 1, 2
		while(i <= r) {
			// if the number is 0, then place it with the begin pointer
			if(nums[i] == 0) { // swap the number with "l"
				int tmp = nums[i];
				nums[i] = nums[l];
				nums[l] = tmp;
				l++; i++; // increment the  begin pointer n also the  current pointer to move forward
			}
			else if(nums[i] == 2) {// if the number is 2, then swap them with the last pointer for high number
				int tmp = nums[i];
				nums[i] = nums[r];
				nums[r] = tmp;
				r--;// decrement only the last right pointer 
				// because current pointer may contain unprocessed data still
			}
			else {// if it is 1.. then  just proceed the current pointer
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] in = {1,2,0};
		sortColors(in);
	}
}
