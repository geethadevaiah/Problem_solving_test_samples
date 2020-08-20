import java.util.HashSet;
import java.util.Set;

public class CheckIfDoubleExists {

	
	public static boolean checkIfExist(int[] arr) {
        
		// Loop from i = 0 to arr.length, maintaining in a hashTable the array elements from [0, i - 1].
		// On each step of the loop check if we have seen the element 2 * arr[i] so far or
		// arr[i] / 2 was seen if arr[i] % 2 == 0.
		
		
		Set<Integer> set = new HashSet<>();
		
		for(int a : arr) {
			if(set.contains(a * 2) || ( set.contains(a/2) && a % 2 ==0 )) {
				return true;
			}
			set.add(a);
		}
		
		
		/*Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0 ; i < arr.length ; i++) {
			if(map.containsValue(arr[i] * 2)) {
				return true;
			}
			if(arr[i] % 2 == 0) {
				if(map.containsValue(arr[i] / 2)) {
					return true;
				}
			}
			map.put(i, arr[i]);
		}*/
		return false;
    }
	
	public static void main(String[] args) {
		
		int[] inputArr = {7,1,10,22};
		System.out.println(checkIfExist(inputArr));
	}

}
