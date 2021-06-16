package Sorting;

public class BubbleSortImpl {

	public static void bubbleSortFunc(int[] arr) {
		
		// bubble sort is the technique with the max number of swaps in the worst case
		int n = arr.length;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n-i-1 ; j++) {
				if(arr[j] > arr[j+1]) swap(j+1, j, arr);
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
		bubbleSortFunc(arr);
		for(int i = 0 ; i < arr.length ; i++)
		System.out.println(arr[i]);
	}
}
