package String;

public class MakingAnagrams {

	public static int makingAnagrams(String a, String b) {
		int[] aCnt = new int[26];
		int[] bCnt = new int[26];
		int count = 0;
		for(int i = 0 ; i < a.length() ; i++) 
			aCnt[a.charAt(i) - 'a'] += 1;
		
		for(int i = 0 ; i < b.length() ; i++) 
			bCnt[b.charAt(i) - 'a'] += 1;
		
		for(int i = 0 ; i < 26 ; i++) 
			count += Math.abs(aCnt[i] - bCnt[i]);
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(makingAnagrams("aabbffxcxfjj", "aabbffjjkkkk"));
	}
}
