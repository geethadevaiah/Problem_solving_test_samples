import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FIndDisappearedNumbers {

	public static List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> list = new ArrayList<>();
		// make the indices of the numbers to negative
		// so positive numbers are not in the array :)
		
		for(int i = 0 ; i < nums.length ; i++) {
			int val = Math.abs(nums[i]) - 1;
			if(nums[val] > 0)
				nums[val] = -nums[val];
		}
		
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] > 0)
				list.add(i + 1);
		}
		
		return list;
    }
	
	public static void main(String[] args) {
		int[] in = {4,3,2,7,8,2,3,1};
		List<Integer> res = findDisappearedNumbers(in);
		for(Integer i : res) {
			System.out.println(i);
		}
	}
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

}
