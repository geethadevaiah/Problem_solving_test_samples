package Ohers;

public class IsPalindromeNumber {

	public static String isPalindromeNumFn(int number){
		
		if(number < 0 || number %10 == 0 || number == 0)
			return "Not a Palindrome";
		
		int reverseNum = 0;
		while (number > reverseNum) {
			reverseNum  = reverseNum * 10 + number % 10;
			number /= 10;
		}
//		System.out.println("reverse nu m ber is "+reverseNum);
//		System.out.println("number is " + number);
//		System.out.println((reverseNum == number || number == reverseNum /10));
		if((reverseNum == number || number == reverseNum /10)) {
			return "Yes! It is a Palindrome";
		}
		else {
			return "No";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindromeNumFn(1324));
		System.out.println(isPalindromeNumFn(-124));
		System.out.println(isPalindromeNumFn(0));
		System.out.println(isPalindromeNumFn(121232121));
	}
}
