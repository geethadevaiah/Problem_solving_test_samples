package Class_revision.Recursion_and_Backtracking;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

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
	public static void printSubsetsBacktracking(int[] arr, Deque<Integer> temp, int i, int n) {
		
		// Base case, print the subset list when the size is full
//		System.out.println("i = "+i+" n = "+n);
		if(i >= n) {
			if(temp.size() > 0)
				System.out.println(temp);
			return;
		}
		
		// recursion
		temp.addLast(arr[i]);
		printSubsetsBacktracking(arr, temp, i+1, n);
//		System.out.println(temp.size());
		temp.removeLast();
		printSubsetsBacktracking(arr, temp, i+1, n);
		
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3};
//		printSubset(arr, 0, "");
		Deque<Integer> list = new ArrayDeque<Integer>();
		printSubsetsBacktracking(arr, list, 0, arr.length);
	}
	
	
}
