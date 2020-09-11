package Ohers;

public class FindSingleInDoubledArray {
	// here bit manipulation is happening
	// a ^ a is 0
	// so if any single element exists it will be filtered.
	
	public int singleNumber(int[] nums) {
		    int a = 0;
		    for (int i : nums) {
		      a ^= i;
		    }
		    return a;
	 }
}
