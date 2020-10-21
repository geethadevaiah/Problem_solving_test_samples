package String;

public class AddBinary {

	public static String addBinary(String s1, String s2) {
		// get two pointers for strings
		
		/*int i = s1.length() - 1;
		int j = s2.length() - 1;
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		while(i >= 0 && j >= 0 ) {
			int sum = carry + Integer.parseInt(s1.charAt(i--)+"") + Integer.parseInt(s2.charAt(j--)+"");
			if(sum > 1) {
				sb.append((sum % 2)+"");
				carry = 1;
			}
			else {
				sb.append(sum);
				carry = 0 ;
			}
		}
		while(i >= 0) {
			int sum = carry + Integer.parseInt(s1.charAt(i--)+"");
			if(sum > 1) {
				sb.append((sum % 2)+"");
				carry = 1;
			}
			else {
				sb.append(sum);
				carry = 0 ;
			}
		}
		while(j >= 0) {
			int sum = carry + Integer.parseInt(s2.charAt(j--)+"");
			if(sum > 1) {
				sb.append((sum % 2)+"");
				carry = 1;
			}
			else {
				sb.append(sum);
				carry = 0 ;
			}
		}
		
		return sb.reverse().toString();*/
		if(s1.equals("0")&&s2.equals("0")) return "0";
		int i = s1.length()-1;
		int j = s2.length()-1;
		StringBuilder abc = new StringBuilder();
		int sum = 0;
		while(i>=0||j>=0){
			if(i>=0)
				sum+=s1.charAt(i--)-48;
			if(j>=0)
				sum+=s2.charAt(j--)-48;
			abc.append(sum%2);
			sum/=2;
		}
		if(sum>0)
			abc.append(sum);
		return abc.reverse().toString();
	}
	public static void main(String[] args) {
		System.out.println(addBinary("101", "1"));
	}
}
