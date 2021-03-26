package String;

public class IsomorphicSrings {
	
	public static  boolean isIsomorphic(String s, String t) {
		
		if(s.length() != t.length() || s == null || t == null) return false;
		
		for(int i = 0 ; i < s.length() ; i++) {
			// char not equal
			if(s.charAt(i) != t.charAt(i)) {
				// change both to same n check whether equal
				s = s.replace(s.charAt(i), t.charAt(i));
				if(s.equals(t)) return true;
			}
		}
		return s.equals(t);
	}
	
	public static void main(String[] args) {
		System.out.println(isIsomorphic("paper", "title"));
	}
}
