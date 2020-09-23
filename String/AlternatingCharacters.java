package String;

public class AlternatingCharacters {
	public static int alternateChars(String s) {
		// get the unique ones
        if(s.length() < 2) return 0;
        String sNew = s.charAt(0)+"";
        for(int i = 1; i < s.length() ; i++){
            System.out.println("sNew is "+ sNew);
            if(sNew.charAt(i-1) != s.charAt(i))
                sNew += s.charAt(i);
        }
        System.out.println("sNew is "+ sNew);
        return s.length() - sNew.length();
	}
	
	public static void main(String[] args) {
		System.out.println(alternateChars("aabababaaaa"));
	}
}
