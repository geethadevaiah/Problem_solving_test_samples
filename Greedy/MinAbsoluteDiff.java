package Greedy;

import java.util.Arrays;

public class MinAbsoluteDiff {
	static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int min_sum = Math.abs(arr[1]-arr[0]);
        for(int i = 0 ; i < arr.length-1 ; i++)
            min_sum = Math.min(min_sum, Math.abs(arr[i+1] - arr[i]));
        return min_sum;
    }
	public static void main(String[] args) {
		int[] in = {1 ,-3, 71,68, 17};
		System.out.println(minimumAbsoluteDifference(in));
	}
}
