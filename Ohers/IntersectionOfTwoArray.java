package Ohers;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArray {
	 public int[] intersect(int[] nums1, int[] nums2) {
		 int size1 = nums1.length;
		 int size2 = nums2.length;
		 
		 // new list
		 ArrayList<Integer> resList = new ArrayList<>();
		 
		 // sort the arrays
		 Arrays.sort(nums1);
		 Arrays.sort(nums2);
		 
		 int i = 0, j = 0;
		 // till the size is complete
		 while(i < size1 && j < size2) {
			 // if less or more just increment the pointers
			 if(nums1[i] < nums2[j]) i++;
			 else if(nums1[i] > nums2[j]) j++;
			 else {// this means they are equal
				 resList.add(nums1[i]);
				 i++;j++; // also increment the pointers
			 }
		 }
		 // new list to return 
		 int res[] = new int[resList.size()];
		 // copy to return
		 for(int k = 0 ; k < resList.size() ; k++)
			 res[k] = resList.get(k);
		 return res;
	 }
}
