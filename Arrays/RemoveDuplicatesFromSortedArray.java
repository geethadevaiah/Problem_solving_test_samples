package Arrays;


public class RemoveDuplicatesFromSortedArray {

	
	public static int removeDuplicates(int[] nums) {
		
		int i = 0;
		int j = i + 1;
		while(j < nums.length) {
			if(nums[i] != nums[j]) {
				nums[++i] = nums[j];
			}
			j++;
		}
		return i + 1;
	}
	
	
	public static void main(String[] args) {
		
		int[] inputArr = {1,1,2};
		int n = removeDuplicates(inputArr);
		System.out.println("Result ? "+n);
		for(int i =0 ; i < n ; i++) {
			System.out.println(inputArr[i]);
		}
	}

}
