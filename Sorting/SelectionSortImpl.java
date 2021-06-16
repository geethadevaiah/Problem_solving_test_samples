package Sorting;

public class SelectionSortImpl {

	public static void selectionSortFunc(int[] arr) {
		int n = arr.length;
		
		// keep finding the least and put it towars the left side
		// which is sorted array until the whole array is sorted
		
		// selection sort is the sorting technique with the min number of swaps!
		for(int i = 0 ; i < n ; i++) {
			for(int j = i ; j < n ; j++) {
				// selection sort finds the least item and put it in the sorted array
				if(arr[j] < arr[i]) swap(i,j, arr);
			}
		}
	}
	
	
	public static void swap(int i , int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 1, 6 , 3, 0, 4};
		selectionSortFunc(arr);
		for(int i = 0 ; i < arr.length ; i++)
		System.out.println(arr[i]);
	}
}
