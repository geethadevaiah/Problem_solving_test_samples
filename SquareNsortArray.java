import java.util.*;
class Solution {
    public static int[] sortedSquares(int[] A) {
        for(int i = 0 ; i < A.length ; i++){
            // A[i] = Math.abs(A[i]);
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A)
        for(int i = 0 ; i < A.length ; i++){
            System.out.println(A[i]);
        }
        
        return A;
    }

    public static void main(String[] args) {
        int[] inputarr =  {-4,-1,0,3,10};
        System.out.println(sortedSquares(inputarr));
    }
}