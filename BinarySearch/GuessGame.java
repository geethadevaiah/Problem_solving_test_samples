package BinarySearch;

public class GuessGame {
	/** 
	 * Forward declaration of guess API.
	 * @param  num   your guess
	 * @return 	     -1 if num is lower than the guess number
	 *			      1 if num is higher than the guess number
	 *               otherwise return 0
	 * int guess(int num);
	 */
	public int guess(int num) {
		int g = 15;
		if( num < 15) return -1;
		else if(num > 15) return 1;
		else return 0;
	}
	
	 public int guessNumber(int n) {
		 // check with the numbers
	        int low = 1, high = n;
	        // check whether the left is less than right
	        while(low <= high){
	        	// binary search template #1
	            int mid = low + (high - low) / 2;
	            // get the result of the function 
	            int res = guess(mid);
	            // 0 is its a match!
	            if(res == 0)
	                return mid;
	            // else change the window
	            else if(res < 0)
	                high = mid -1;
	            else 
	                low = mid + 1;
	        }
	        return -1;
	    }
}
