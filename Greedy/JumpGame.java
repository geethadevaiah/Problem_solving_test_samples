package Greedy;

public class JumpGame {

	
	public static boolean jumpGameFn(int[] arr) {
		
		int lastIndexPos = arr.length - 1;
		
		for(int i = arr.length-1 ; i >=0 ; i--) {
			if(arr[i]+i >= lastIndexPos) {
				lastIndexPos = i;
			}
		}
		return lastIndexPos == 0;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,3,1,1,1};
		System.out.println(jumpGameFn(nums));
	}
}
