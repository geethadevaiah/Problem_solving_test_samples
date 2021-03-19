package BinarySearch;

public class DivideTwoIntegers {
	
	public static int divideInteger(int dividend, int divisor) {
		
		if(dividend ==0) return 0;
		if(divisor == 1) return dividend;
		//deciding the sign
		int sign = 1;
		if(dividend < 0 || divisor < 0) {
			if(dividend < 0 ) {
				sign *= -1;
				dividend *= -1;
			}
			if(divisor < 0){
				sign *= -1;
				divisor *= -1;
			}
		}
		if(dividend == 1 && divisor == 1) return sign * 1;
		int tmpDivisor = divisor; int count = 1;
		while(tmpDivisor < dividend) {
			tmpDivisor = (++count) * divisor;
		}
		int result = sign * (count-1);
		return  result > Integer.MAX_VALUE ? Integer.MAX_VALUE : result;
	}
	
	public static void main(String[] args) {
		System.out.println(divideInteger(25, -3));
	}
}
