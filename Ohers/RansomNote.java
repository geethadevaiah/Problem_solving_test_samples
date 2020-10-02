package Ohers;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void findRansomNote(String[] magazine, String[] note) {
		
		Map<String, Integer> mapMagazine = new HashMap<>();
		Map<String, Integer> mapNote = new HashMap<>();
		
		// add every word to the map
		for(String a : magazine) 
			mapMagazine.put(a, mapMagazine.getOrDefault(a, 0)+1);
		
		for(String b : note)
			mapNote.put(b, mapNote.getOrDefault(b, 0)+1);
		
		boolean checkRansom = true;
		// comparing the maps
		for(String s : mapNote.keySet()) {
			if(!mapMagazine.containsKey(s) || mapMagazine.get(s) < mapNote.get(s)) {
				checkRansom = false;
				break;
			}
		}
		if(checkRansom)
			System.out.println("YES");
		else
			System.out.println("NO");
		
	}
	
	public static void main(String[] args) {
		String[] A = {"give", "me", "one", "grand", "today","night"};
		String[] B = {"give", "one", "grand", "today"};
		
		findRansomNote(A,B);
	}
}
