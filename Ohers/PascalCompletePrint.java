package Ohers;

import java.util.ArrayList;
import java.util.List;

public class PascalCompletePrint {
	
    public static List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> mainList = new ArrayList<List<Integer>>();
    	if(numRows == 0 ) return mainList;
    	
    	mainList.add(new ArrayList<Integer>());
    	mainList.get(0).add(1);
    	for(int i = 1 ; i < numRows ; i++) {
    		List<Integer> currList = new ArrayList<>();
    		currList.add(1);
    		List<Integer> prevList = mainList.get(i-1);
    		for(int j = 1 ; j < i ; j++) 
    			currList.add(prevList.get(j-1) + prevList.get(j));
    		currList.add(1);
    		mainList.add(currList);
    	}
    	return mainList;
    }
    public static void main(String[] args) {
		System.out.println(generate(3));
	}
}
