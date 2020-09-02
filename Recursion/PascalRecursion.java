package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalRecursion {
	 
	 public static List<Integer> getRow(int rowIndex) {
		 List<Integer> finalList = new ArrayList<>();
		 finalList.add(1);
		 if(rowIndex == 0) return finalList;
		 
		 // this is the list to have the previous row. then add it to the finalList
		 List<Integer> prevList = getRow(rowIndex - 1);
		 for(int i = 1 ; i <  prevList.size() ; i++) {
			 // add the previous row elements
			 int curr = prevList.get(i - 1) + prevList.get(i);
			 finalList.add(curr);
		 }
		 finalList.add(1);					 
         return finalList;
	 }
	
	    public static void main(String[] args) 
	    { 
	        int n = 3; 
	        List<Integer> arr = getRow(n); 
	  
	        for (int i = 0; i < arr.size(); i++) { 
	            if (i == arr.size() - 1) 
	                System.out.print(arr.get(i)); 
	            else
	                System.out.print(arr.get(i) 
	                                 + ", "); 
	        } 
	    } 
	    
	    // in js
//	    var getRow = function (rowIndex) {
//	    	  var res = [];
//	    	  for (let i = 0; i <= rowIndex; i++) {
//	    	    for (let j = i; j >= 0; j--) {
//	    	      res[j] = j == 0 || j == i ? 1 : res[j] + res[j - 1];
//	    	    }
//	    	  }
//	    	  return res;
//	    	};
}
