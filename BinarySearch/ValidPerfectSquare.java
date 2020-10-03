package BinarySearch;

public class ValidPerfectSquare {

	public static boolean isPerfectSquare(int num) {
		return search(num, 1, 46341);
	}
	
	private static boolean search(int target, int left, int right) {
		if(left == right && left * left == target)
            return true;
        else if(left >= right)
            return false;
        int mid = (left + (right - left) / 2);
        int mid2 = mid * mid;
        if(mid2 == target)
            return true;
        else if(mid2 > target)
            return search(target, left, mid - 1);
        else
            return search(target, mid + 1, right);
	}
	
	public static void main(String[] args) {
		System.out.println(isPerfectSquare(121));
	}
}
