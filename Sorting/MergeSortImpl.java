package Sorting;

public class MergeSortImpl {

	
	public static void mergeSortImpl(int[] a) {
		
		
	}
	
	public void divide(int[] a, int l , int r) {
		
		if(r-l >= 0) {
			int mid = r - (l + r) / 2;
			divide(a, l, mid);
			
			divide(a, r, mid+1);
		}
	}
	
	public void merge(int[] a , int l, int r) {
		
		int n = a.length;
		int mid = r - (l + r) / 2;
		int i = 0, j = mid+1;
		while(i < mid || j < n) {
			
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 1, 6 , 3, 0, 4};
		mergeSortFunc(arr);
		for(int i = 0 ; i < arr.length ; i++)
		System.out.println(arr[i]);
	}
	
}
