package Hackerrank;

public class FindMinimumSwaps {
	static int minimumSwaps(int[] arr) {
        int i =0, count=0, temp;
        int n = arr.length;
        // till the index is less than length
        while(i<n){
        	// check if the number is index
            if(arr[i] != i+1){
            	// exchange with its position to be
                temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1]=temp;
                count++; // increment the count of swaps
            }
            else{
            	// increment the index it is in correct position
                i++;
            }
        }
        return count;
	}
}
