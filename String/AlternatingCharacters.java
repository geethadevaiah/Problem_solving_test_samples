package String;

public class AlternatingCharacters {
	public static int alternateChars(String s) {
		// get the unique ones
        if(s.length() < 2) return 0;
        StringBuilder sb = new StringBuilder();
        
        char presentChar = s.charAt(0);
        for(int i = 1; i < s.length() ; i++){
            if(presentChar != s.charAt(i))
                sb.append(s.charAt(i));
            presentChar = s.charAt(i);
        }
        return s.length() - sb.length() - 1;
	}
	
	public static void main(String[] args) {
		System.out.println(alternateChars("ababbbaabbaaa"));
	}
}
