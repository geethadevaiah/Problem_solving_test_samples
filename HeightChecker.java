import java.util.Arrays;

public class HeightChecker {
	 public static int heightChecker(int[] heights) {
	        
		 int counter = 0;
		 int[] unsorted = new int[heights.length];
		 for(int i = 0 ; i < heights.length ; i++) unsorted[i] = heights[i];
		 Arrays.sort(heights);
		 for(int i = 0 ; i < heights.length ; i++) {
			 if(heights[i] != unsorted[i]) counter++;
		 }
		 return counter;
	    }
	public static void main(String[] args) {
		
		int[] A = {1,1,4,2,1,3};
		System.out.println(heightChecker(A)); 
		
	}

}
