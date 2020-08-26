package Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        
        int[] p1 = {1, 5};
        int[] p2 = {4, 6, 8};

        System.out.println("Median is ?? "+findMedian(p1, p2));
    }

    public static float findMedian(int[] p1, int[] p2){

        int[] sortedSingleArray = {};
        for(int i = 0 ; i < p1.length ; i++){
            for(int j = 0, k = 0 ; j < p2.length ; j++){
                
                if(p1[j] < p2[j]){
                    sortedSingleArray[k++] = p1[j];
                }
                

            }
        }

        return (float)2.5;
    }
}