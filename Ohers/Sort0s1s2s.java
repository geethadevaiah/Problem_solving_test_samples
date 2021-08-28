package Ohers;

public class Sort0s1s2s {
	
	public static void sort012(int[] arr, int n) {
		
		if(n < 2) return;
		// taking the help of three pointers to make 4 sections [0,1,2]
		// mid is the current moving pointer
		int low = 0, high = n-1, mid = 0, temp = 0;
		// loop through till mid crosses the high
		while(mid <= high) {
			switch(arr[mid]) {
				case 0 : {
					// exchange the value in low and mid indices (because low might contain 1 or 2)
					// move low and mid
					temp = arr[low];
					arr[low] = arr[mid];
					arr[mid] = temp;
					low++; mid++;
					break;
				}
				case 1: {
					// increment mid (1 is correct in mid position)
					mid++;
					break;
				}
				case 2 : {
					// exchange high and mid ( might contain 0 also)
					temp = arr[high];
					arr[high] = arr[mid];
					arr[mid] = temp;
					high--; // decrement the high value
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {0,1,0,1,2,1,2,0,1,0,2,1};
		sort012(arr, arr.length);
		for(int i = 0 ; i < arr.length ; i++)
			System.out.println(arr[i]);
	}
	
}
