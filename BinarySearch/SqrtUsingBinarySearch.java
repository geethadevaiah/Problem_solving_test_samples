package BinarySearch;

public class SqrtUsingBinarySearch {

	// find the sqrt of a number using binary template #1
	public int mySqrt(int x) {
		// if x is less than , return the value
        if(x < 2) 
        	return x;
        
        // left and right pointers to be the window
        int left = 0, right = x;
        // condition where left does not cross over the right pointer
        while(left < right){
        	// find the mid pointer acc to template #1
            int mid = left + (right - left) / 2 + 1;
            // if its square is greater than x
            if( Math.pow(mid, 2)  > x)
            	// shrink the window
                right = mid - 1;
            else 
                left = mid;
        }
        return left;
    }
}

// directly using MAth util
// return (int) Math.sqrt(x);
