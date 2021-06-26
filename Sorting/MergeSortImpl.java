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
			
			divide(a, mid+1, r);
			
			merge(a, 0 , mid);
		}
	}
	
	public static void merge(int[] a , int l, int r) {
		
		System.out.println("in merge function!");
		
		int n = a.length;
//		int mid = l + (r - l) / 2;
		int i = 0, j = r, k = 0;
		// get a temp array and insert the sorted numbers to that
		int[] result = new int[a.length]; 
		while(i < j || j < r) {
			if(a[i] <= a[j]) {
				result[k++] = a[i];
				i++;
			}
			else if(a[i] > a[j]) {
				result[k++] = a[j];
				j++;
				
//				// number in the second part is greater
//				// push all the elements by right 1
//				int k = j;
//				int key = a[k];
//				while(k > i) {
//					a[k] = a[k-1];
//					k--;
//				}
//				j++;
//				a[i] = key;
			}
		}
		while(i < l) {
			result[k++] = a[i++];
		}
		while(j < r) {
			result[k++] = a[j++];
		}
		System.out.println("Check the array now to be sorted!");
		a = result;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 1, 6, 0};
		divide(arr, 0 , arr.length/2);
		for(int i = 0 ; i < arr.length ; i++)
		System.out.println(arr[i]);
	}
	
}
