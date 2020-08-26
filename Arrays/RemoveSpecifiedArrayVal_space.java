package Arrays;
public class RemoveSpecifiedArrayVal_space {

	// gives the length of the array after removing the val
	public static int removeElement(int[] nums, int val) {
        
		int i = 0;
	    for (int elem: nums){
	        if (elem != val){
	            nums[i] = elem;                
	            i++;
	        }
	    }
		return i;
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
