package Arrays;

 class MergeSortedArrays {
    /**
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void  merge(int[] nums1, int m, int[] nums2, int n) {
        
    	System.out.println("nums length ? "+nums1.length);
    	System.out.println("Nums2 length ? "+nums2.length );
    	
    	  
    	int i = m-1; //==> index of nums1 excluding zeroes at the end
    	int j = n-1; //==> index of nums2
    	int index = nums1.length - 1;
    	if(m == 0) {
    		while(index >= 0) {
    			nums1[index--] = nums2[j--];
    		}
    		return;
    	}
    	while(index >= 0 && (i >= 0 || j >= 0)) {
    		//System.out.println(nums1[i]+"  "+nums2[j]);
    		if( i>= 0 && j >= 0) {
    			//System.out.println("i and j inside if "+i +" "+ j);
	    		if(nums1[i] >= nums2[j]) {
	    			nums1[index--] = nums1[i--];
	    		}
	    		else {
	    			nums1[index--] = nums2[j--];
	    		}
    		}
    		else if(i >=0){
    				nums1[index--] = nums1[i--];
    		}
    		else if(j >= 0) {
    				nums1[index--] = nums2[j--];
    		}
    	}
    	
    	for(int r = 0 ; r < nums1.length ; r++) {
    		System.out.println(nums1[r]);
    	}
    }
		
	public static void main(String[] args) {
		// nums1 = [1,2,3,0,0,0], m = 3
		// nums2 = [2,5,6],       n = 3
		
//		int[] nums1 = {1,2,3,0,0,0};
//		int[] nums2 = {2,5,6};
		int[] nums1 = {2,0};
		int[] nums2 = {1};

//		int m = 3, n = 3;
		int m = 1, n = 1;
		merge(nums1, m, nums2, n);
		
	}

}
