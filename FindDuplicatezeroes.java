
class FindDuplicatezeroes {
    public static void duplicateZeros(int[] arr) {
        
	    int tmp;
	    
	    for(int i = 0 ; i < arr.length ; i++) {
	    	if(arr[i] == 0) {
	    		shiftArray(arr, ++i);
	    	}
	    }

    	for(int i = 0 ; i < arr.length ; i++) {
    		System.out.println(arr[i]);
    	}
    }
    
    public static void shiftArray(int[] arr, int cur) {
    	if (cur == arr.length) return;
    	int prev = arr[cur];
    	arr[cur] = 0 ;
    	int  tmp ;
    	while(cur < arr.length) {
    		if (cur + 1 < arr.length) {
	    		tmp = arr[cur + 1];
	    		arr[++cur] = prev;
	    		prev = tmp;
    		}
    		else
    			cur++;
    	}
    	
    }

    public static void main(String[] args) {
        int[] inputarr =  {1,0,2,3,0,4,5,0};
        duplicateZeros(inputarr);
    }
}