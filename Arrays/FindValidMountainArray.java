package Arrays;


public class FindValidMountainArray {

	
	public static boolean validMountainArray(int[] A) {
        
		if(A.length < 3 || A == null) {
			return false;
		}
		// have to be strictly increasing or decreasing
		
		int n = A.length-1;
		int i = 0;
		while(i < n && A[i] < A[i+1])
			i++;
		
		if(i == n || i == 0) return false;
		while(i < n && A[i] > A[i+1])
			i++;
		
		// return true if has reached the end.
		return i == n;
    }
	public static void main(String[] args) {
		
//		int[] A = {1,3,2};
		int[] A = {9,8,7,6,5,4,3,2,1,0};
		System.out.println(validMountainArray(A));
	}

}
