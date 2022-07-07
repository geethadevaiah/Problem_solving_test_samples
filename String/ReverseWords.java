package String;

public class ReverseWords {

	public static String reverseWords(String words) {
		
		StringBuilder word = new StringBuilder();
		StringBuilder result = new StringBuilder();
		
		for(char ch : words.toCharArray()) {
			if(ch != ' ') {// not space.. keep on appending the character to form the word
				word.append(ch);
			}
			else {
				result.append(word.reverse());
				result.append(" ");
				word.setLength(0);
			}
		}
		result.append(word.reverse());
		result.append(" ");
		
		return result.toString().trim();
	}
	
	public static void main(String[] args) {
		String str = "Let's take LeetCode contest";
		System.out.println(reverseWords(str));
	}
}
