package Ohers;

import java.util.Stack;

public class LargestRectangleHistogram {
	
	public static int largestRectangleArea(int[] heights) {
        
		int max_area = 0, top_area = 0;
		int i = 0, n = heights.length;
		Stack<Integer> t = new Stack<>();
		
		// iterate through the array
		while(i < n ) {
			// if the stack is empty or current element of array > the index stored in top of stack,
			// push the current index to the stack
			// store the highest number index at the top of the stack 
			if(t.empty() || heights[t.peek()] <= heights[i])
				t.push(i++);
			else {
				// get the top element index
				int top = t.peek();
				t.pop();// pop from the stack
				// calculate the area = stack[stacktopIndex] * the indices (next ele in stack sub curr ele in stack) 
				top_area = heights[top] * (t.empty() ? i : i-t.peek()-1);
				max_area = Math.max(max_area, top_area);// calculate the highest
			}
		}
		// if all elements added to stack
		// iterate till empty array
		while(!t.empty()) {
			int top = t.peek();
			t.pop();
			// calculate area popping all elements from the stack
			top_area = heights[top] * (t.empty() ? i : i-t.peek()-1);
			max_area = Math.max(max_area, top_area);
		}
		
		return max_area;
    }
	
	public static void main(String[] args) {
		int[] nums = {2,1,5,6,2,3};
		System.out.println(largestRectangleArea(nums));
	}
}
