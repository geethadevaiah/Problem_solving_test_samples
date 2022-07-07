package Arrays;

public class ArrangeCoins {

	
	public static int buildStaircase(int n) {
		int m = n;
		for(int i = 1 ; i <= m ; i++) {
			if(n < i) return i-1;
			n -= i;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		//Given the integer n, return the number of complete rows of the staircase you will build.
		
		int n = 10;
		
		System.out.println(buildStaircase(n));
		System.out.println(arrangeCoins(5));
	}
	// arrange coins by binary search
	public static int arrangeCoins(int n) {
		
		int low = 0, high = n;
		int mid = 0, curr = 0;
		
		while(low <= high) {
			mid = low + (high - low)/2;
			curr = mid * (mid+1)/2;
			if(curr == n) return mid;
			if(curr > n) high = mid-1;
			else low = mid + 1;
		}
		return high;
	}
}
