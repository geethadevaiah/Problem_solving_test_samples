package String;

public class ReverseInteger {
	public static int reverse(int x) {
		// reverse integer 
		long rev = 0;
		// till the input value is not 0
        while(x != 0){
        	// move rev to the next tens place and get the last digit of x
            rev = rev * 10 + x % 10;
            // lower the x number by tens place each iteration
            x /= 10;
        }

        // for handling the min and max values..
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        } else {
        	// return the integer value
            return (int) rev;
        }
    }
	public static void main(String[] args) {
		System.out.println(reverse(-143));
	}
}
