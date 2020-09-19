package Ohers;

public class hammingWeight {
	public static int hammingWeightF(int n) {
		
		int sum = 0;
		// performing AND operation between n n-1 till n turns to 0
		while (n != 0) {
			sum++;
		    n &= (n - 1);
		}
		return sum;
		
	    /*int bits = 0;
	    int mask = 1;
	    for (int i = 0; i < 32; i++) {
	        if ((n & mask) != 0) {
	            bits++;
	        }
	        mask <<= 1;
	    }
	    return bits;*/
	}
	public static void main(String[] args) {
		System.out.println(hammingWeightF(7));
	}
}
