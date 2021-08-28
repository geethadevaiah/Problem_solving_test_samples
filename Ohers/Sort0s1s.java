package Ohers;

public class Sort0s1s {

	
	public static void sort10(int[] arr, int n ) {
		
		if(n < 2) return ;
		// two pointer technique
		int low = 0, high = n-1;
		
		while(low < high) {
			// increase left pointer till 0s
			while(low<high && arr[low] == 0) low++;
			// similarly decreasing right pointer while all 1s
			while(low < high && arr[high] == 1) high--;
				
			// if low is still less than high then there still exists 1 on the left n 0 in the right
			if(low < high) {
				arr[low] = 0;
				arr[high] = 1;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {0,0,0,1,0,1,0,1};
		sort10(arr, arr.length);
		for(int i = 0 ; i < arr.length ; i++)
		System.out.println(arr[i]);
	}
}
