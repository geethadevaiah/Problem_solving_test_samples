package Arrays;

public class MinSizeSubarraySum {

	
	public static Integer minSubArrayLength(int[] arr, int target) {
		
		int result = Integer.MAX_VALUE;
		int sum = 0;
		int left = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
			
			while(sum >= target) {
				result = Math.min(result, i+1 - left);
				sum -= arr[left++];
			}
		}
		
		
		return (result != Integer.MAX_VALUE ) ? result : 0;
	}
	
	public static void main(String[] args) {
		// calling the minimum size sub array for a given array and target
		int[] arr = {1,2,4,2,6};
		int target = 6;
		System.out.println(minSubArrayLength(arr, target));
	}

}
