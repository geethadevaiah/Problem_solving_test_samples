package Sorting;

public class MergeSortImpl {

	
	public static void mergeSortImpl(int[] a) {
		
		divide(a, 0 , a.length);
		merge(a, 0 , a.length);
	}
	
	public static void divide(int[] a, int l , int r) {
		//r-l >= 0
		if(l < r) {
			System.out.println("inside divide function!");
			int mid = l + (r - l) / 2;
			divide(a, l, mid);
			merge(a, 0 , a.length);
			divide(a, r, mid+1);
			
			
		}
	}
	
	public static void merge(int[] a , int l, int r) {
		
		System.out.println("in merge function!");
		
		int n = a.length;
		int mid = l + (r - l) / 2;
		int i = 0, j = mid+1;
		while((i < n & i < mid) || j < n) {
			if(a[i] <= a[j]) {
				i++;
			}
			else if(a[i] > a[j]) {
				// number in the second part is greater
				// push all the elements by right 1
				int k = j;
				int key = a[k];
				while(k > i) {
					a[k] = a[k-1];
					k--;
				}
				j++;
				a[i] = key;
			}
		}
		System.out.println("Check the array now to be sorted!");
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 1, 6, 0};
		divide(arr, 0 , arr.length);
		for(int i = 0 ; i < arr.length ; i++)
		System.out.println(arr[i]);
	}
	
}
