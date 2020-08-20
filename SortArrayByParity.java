
public class SortArrayByParity {
	
	public static int[] sortArrayByParity(int[] A) {
        int evenPointer = 0;
        int oddPointer = A.length-1;
        
        /*for(int i = 0 ; i < A.length-1 ; i++) {
        	if(oddPointer == evenPointer) break;
        	if(A[i] % 2 == 0) {
        		if(i == evenPointer) {
        			evenPointer++;
        			continue;
        		}
        		int k = i;
        		int tmp = A[k];
        		while(k > evenPointer) {
        			A[k] = 
        		}
        		A[evenPointer++] = tmp;
        	}
        	else {//odd case
        		if(i == oddPointer) {
        			oddPointer--;
        			continue;
        		}
        		int k = i;
        		int tmp = A[k];
        		while(k < oddPointer) {
        			A[k] = A[k+1];k++;
        		}
        		A[oddPointer--] = tmp;i--;
        	}
        }*/
        	
        	
    	while(evenPointer != oddPointer) {
    		if(A[evenPointer] % 2 == 0) {
    			evenPointer++;
    		}
    		else {
    			int k = evenPointer;
        		int tmp = A[k];
        		while(k < oddPointer) {
        			A[k] = A[++k];
        		}
        		A[oddPointer--] = tmp;
    		}
    	}
    	
		return A;
		
		 /* best runtime
		 	int lastEvenIndex = 0;
	        for (int i=0; i< A.length; i++) {
	            if (A[i] % 2 == 0) {
	                int tmp = A[lastEvenIndex];
	                A[lastEvenIndex] = A[i];
	                A[i] = tmp;
	                lastEvenIndex++ ;
	            }
	        }  
	        return A;		
		*/
		
		
    }

	public static void main(String[] args) {
		int[] A = {3,2,1,5,7,9,6,4};
//		int[] A = {3,1,2,4};
		int[] B = sortArrayByParity(A); 
		for(int i =0 ; i < B.length ; i++) {
			System.out.println(B[i]);
		}
	}

}
