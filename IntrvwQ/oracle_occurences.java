package IntrvwQ;

import java.util.HashMap;
import java.util.Map;

public class oracle_occurences {

	public static void main(String[] args) {
	
		String input = "my name is geetha my name";
		//output :: "my" :2, "name":2,
		// split
		String[] arr = input.split(" ");
		//map
		Map<String, Integer> result = new HashMap<String , Integer>();
		for(String s : arr) 
			result.put(s, result.getOrDefault(s, 0) + 1);
		System.out.println(result);
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
