package Class_revision.Recursion_and_Backtracking;

public class PrintAllSubsets {

	
	public static void printSubset(int[] arr, int i, String osf) {
		
		// Base case
		if(i >= arr.length) {
			System.out.println("["+osf +" ]");
			return ;
		}
		
		// Recursion assumption
		// Every element has two options
		// 1. to include in the subset 
		// 2. not to include with the remaining subset
		
		printSubset(arr, i+1, osf + " " + String.valueOf(arr[i]));
		printSubset(arr, i+1, osf);
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3};
		printSubset(arr, 0, "");
	}
	
	
}
