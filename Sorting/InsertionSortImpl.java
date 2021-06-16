package Sorting;

public class InsertionSortImpl {
	
	public static void insertionSortFunc(int[] arr) {
		
		int n = arr.length;
		for(int i = 1 ; i < n ; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
			
			// get another index j from i-1 to the end of sorted array
			// traverse till any element is greater than key, else break
			
//			for(int j = i-1; j > 0; j--) {
//				if(arr[j] > key) arr[j+1] = arr[j];
//				else {
//					arr[j+1] = key;break;		
//				}
//			}
		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 4, 5, 1, 6 , 3, 0, 4};
		insertionSortFunc(arr);
		for(int i = 0 ; i < arr.length ; i++)
		System.out.println(arr[i]);
	}
}
