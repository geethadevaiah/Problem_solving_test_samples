package Ohers;

import java.util.HashMap;
import java.util.Map;

public class ROmanToInteger {
	 static Map<Character, Integer> map = new HashMap<>();
	 public static void initializeMap() {
		// initialize map here
		 map.put('I', 1);
		 map.put('V', 5);
		 map.put('X', 10);
		 map.put('L', 50);
		 map.put('C', 100);
		 map.put('D', 500);
		 map.put('M', 1000);
	}
	    
    public static int romanToInt(String s) {
//    	if (s == "") return 0;
        initializeMap();
        int num = 0;
        if(s.length()<2)
            return map.get(s.charAt(0));
        for(int i = 0 ; i < s.length() ; i++) {
        	
        	if(i+1 < s.length() && (map.get(s.charAt(i+1)) > map.get(s.charAt(i)) )) {
        		num += map.get(s.charAt(i+1)) - (1 * map.get(s.charAt(i)));
    			i++;
        	}
        	else num += map.get(s.charAt(i));
        	// just check if the i+1 val is greater than i's val
        	/*if((s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') &&  (i+1 < s.length())) {
        		if(s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1)=='X') ||
        		(s.charAt(i) == 'X' && (s.charAt(i+1) == 'L'||s.charAt(i+1)=='C')) ||
        		(s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))){
        			num += map.get(s.charAt(i+1)) - (1 * map.get(s.charAt(i)));
        			i++;
        		}
        		else num += map.get(s.charAt(i));
        	}
        	else num += map.get(s.charAt(i)) ;
        	*/
        }
        return num;
    }
     public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}
}
