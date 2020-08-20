
public class MoveZeroes {
	public static void moveZeroes(int[] nums) {
		int n = nums.length;
		int zeroPointer = n-1;
		for(int i = n-2 ; i >= 0 ; i--) {
			if(nums[i] == 0) {
				
				int k = i;
				while(k < zeroPointer) {
					nums[k] = nums[++k];
				}
				nums[zeroPointer--] = 0; 
			}
		}
	}

	public static void main(String[] args) {
		int[] A = {1,0,1,0,2,3,4,0,0,10};
		moveZeroes(A); 
		for(int i =0 ; i < A.length ; i++) {
			System.out.println(A[i]);
		}
	}

}
