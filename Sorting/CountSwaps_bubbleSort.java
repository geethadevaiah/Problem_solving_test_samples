package Sorting;

public class CountSwaps_bubbleSort {
	static void countSwaps(int[] a) {

        int count = 0, n = a.length; 
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                System.out.println(a[j]+"   "+a[j+1]);
                if (a[j] > a[j + 1]) {
                    System.out.println("gone inside");
//                    swap(a[j], a[j + 1]);
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    count++;
                }
            }
            
        }
        System.out.println("Array is sorted in "+count+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);

    }
    static void swap(int a , int b){
        int tmp = a;
        a = b;
        b = tmp;
    }
    
    public static void main(String[] args) {
    	int a[] = {1,2,3};
    	countSwaps(a);
	}
}
