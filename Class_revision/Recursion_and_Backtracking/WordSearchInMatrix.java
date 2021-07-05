package Class_revision.Recursion_and_Backtracking;

public class WordSearchInMatrix {

	public static boolean wordSearch(char[][] arr, String str, int i , int j , int searchIndex) {
		
		// base case
		// when reached outside board
		if(i >= arr.length || j >= arr[0].length) return false;
		// check for the char is present or not
		if(arr[i][j] != str.charAt(searchIndex)) return false;
		// if the word matches.. when searchIndex reaches the last char of str (string to be searched)
		if(searchIndex == str.length() - 1) return true;
		
		// change it to $ for tracking visited characters 
		arr[i][j] = '$';
		
		// check in all directions if the required char is present ( currently right or downward or diagonal)
		boolean result = wordSearch(arr, str, i, j + 1, searchIndex + 1) || wordSearch(arr, str, i + 1, j, searchIndex + 1)
				|| wordSearch(arr, str, i + 1, j + 1, searchIndex + 1);// for diagonal
		// getting back the initial char
		arr[i][j] = str.charAt(searchIndex);
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		char[][] charStr = { {'a', 'b', 'c'},
							{'d' , 'e' , 'f'},
							{'g', 'h', 'i'}};
		
		System.out.println(wordSearch(charStr, "aei", 0 , 0 , 0));
		
	}
	
}
