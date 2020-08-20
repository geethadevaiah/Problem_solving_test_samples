
public class RemoveSpecifiedArrayVal {

	// gives the length of the array after removing the val
	public static int removeElement(int[] nums, int val) {
        
		int endP = nums.length - 1;
		int tmpP = endP;
		
		while(tmpP >= 0) {
			if(nums[tmpP] == val) {
				swap(nums, tmpP, endP);
				endP--;
			}
			tmpP--;
		}
		return endP + 1;
    }
	
	
	public static void swap(int[] nums, int tmpP, int endP) {
		int prev = nums[endP];
		nums[endP] = nums[tmpP];
		nums[tmpP] = prev;
	}
	
	public static void main(String[] args) {
		int[] inputArr = {0,1,2,2,3,0,4,2};
		int val = 2;
		System.out.println("Result is ? "+removeElement(inputArr, val));
		for(int i =0 ; i < inputArr.length ; i++) {
			System.out.println(inputArr[i]);
		}
	}

}
