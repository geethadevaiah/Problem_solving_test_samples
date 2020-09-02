package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Pascal_efficient {
	// Print the N-th row of the 
	// Pascal's Triangle 
	static List<Integer> generateNthrow(int rowIndex) { 
	  
		 // No recursion
        List<Integer> finalList = new ArrayList<>();
		// nC0 = 1 
        int prev = 1, N = rowIndex; 
        finalList.add(prev);

        for(int i = 1; i <= N; i++){

           // nCr = (nCr-1 * (n - r + 1))/r 
           int curr = (prev * (N - i + 1)) / i; 
           finalList.add(curr);
           prev = curr; 
        }
        return finalList;
	} 
	public static void main (String[] args) { 
	    int N = 5; 
	    List<Integer> arr =generateNthrow(N); 
		  
        for (int i = 0; i < arr.size(); i++) { 
            if (i == arr.size() - 1) 
                System.out.print(arr.get(i)); 
            else
                System.out.print(arr.get(i) + ", "); 
        } 
	} 
	 
}
