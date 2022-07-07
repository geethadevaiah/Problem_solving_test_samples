package Arrays;

public class SquaresOfASortedArray {

	public static int[] squareNSort(int[] nums) {
		
		int n = nums.length;
		//if(n < 2) return nums;
		
		int[] result = new int[nums.length];
		int i = 0 , j = n-1;
		for(int p = n-1; p >= 0 ; p--) {
			
			if(Math.abs(nums[i]) > Math.abs(nums[j])) {
				result[p] = nums[i] * nums[i];
				i++;
			}
			else {
				result[p] = nums[j] * nums[j];
				j--;
			}
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		
		int nums[] = {-4,-1,0,3,10};
		int[] result = squareNSort(nums);
		for(int i1 = 0 ; i1 < nums.length; i1++) {
			System.out.println(result[i1]);
		}
	}
}
