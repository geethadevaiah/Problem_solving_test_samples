package Class_revision.Recursion_and_Backtracking;

import java.util.ArrayList;
import java.util.List;

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
	
	// Using backtracking
	public static void printSubsetsBacktracking(int[] arr, List<Integer> temp, int i, int n) {
		
		// Base case, print the subset list when the size is full
		if(i == n) {
			if(temp.size() > 0) {
				for(int j = 0 ; j < temp.size() ; j++) {
					System.out.print(temp.get(j));
					return;
				}
				System.out.println();
			}
		}
		
		// recursion
		temp.add(arr[i]);
		printSubsetsBacktracking(arr, temp, i+1, n);
		System.out.println(temp.size());
		temp.remove(temp.size()-1);
		printSubsetsBacktracking(arr, temp, i+1, n);
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3};
//		printSubset(arr, 0, "");
		List<Integer> list = new ArrayList<>();
		printSubsetsBacktracking(arr, list, 0, arr.length);
	}
	
	
}
