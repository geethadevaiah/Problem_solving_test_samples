package String;

public class CountAndSay {

	public static String getCountAndSay(int n) {
		if(n == 0) return "1";
		// first row and count
		String s = "1", t ="" ;
		n--;// first row done so decrement n
		while(n > 0) { // for the number of rows given
			// start reading the s
			int count = 1; // initialize the count for the first character
			char c = s.charAt(0); //pick the first character in s
			t = ""; // String to append
			for(int i = 1 ; i < s.length() ; i++) { // as long as s still have element to count
				if(c == s.charAt(i)) count++; // increment if the character is same
				else { // else add it to temp - t  
					t += count + "" + c;
					count = 1; // initialize count and next character to read
					c = s.charAt(i);
				}
			}
			// add the complete current s to the outer scope s
			t += count + "" + c;
			n--; // decrement the row count
			s = t; // s becomes the new row to read
		}
		// return the counted string
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(getCountAndSay(4));
	}
}
