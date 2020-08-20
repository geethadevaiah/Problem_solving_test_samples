
public class ReplaceElewithGreatestEleOnRightSide {

	/*Given an array arr, replace every element in that
	 *  array with the greatest element among the elements
	 *   to its right, and replace the last element with -1.*/
	 
	public static int[] replaceElements(int[] arr) {
        // replace the last element with -1 
		// start comparing the greatest element from the right n replace till end 0
		
		int n = arr.length;
		int max = arr[n-1];
		arr[n-1] = -1;
		for(int i = n-2 ; i >= 0 ; i--) {
			int tmp = arr[i];
			arr[i] = max;
			// update max
			if(max < tmp)
				max = tmp;
		}
		return arr;
    }

	public static void main(String[] args) {
		int[] A = {17,18,5,4,6,1};
		int[] in = replaceElements(A); 
		for(int i =0 ; i < in.length ; i++) {
			System.out.println(in[i]);
		}
	}

}
