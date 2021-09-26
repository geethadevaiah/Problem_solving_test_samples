package Arrays;

import java.util.ArrayList;
import java.util.List;

// to print the series of missing numbers in array from 0-99.
// [3,10,77]
// response [[0,2],[4,9],[11,76],[78,99]]

public class SeriesOfMissingNumbers {

	
	public static void printSeries(int[] arr, int n) {
	
		List<Integer> s = new ArrayList<Integer>();
		List<Integer>[] a = null;
		int counter = 0;
		s.add(0);
		a[counter] = s;
		int nc = 0;
		// brute force technique
		for(int i = 1 ; i < 100 ; i++) {
			if(arr[nc] == i) {
				s.add(i - 1);
				a[counter++] = s;
				s.add(i + 1);
				nc++;
			}
			if(nc == n) break;
		}
		if(!s.contains(99))s.add(99);
		for(int i = 0; i < s.size(); i++) {
			System.out.print(s.get(i)+" ");
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {3,10,77};
		printSeries(arr, arr.length);
	}
}
