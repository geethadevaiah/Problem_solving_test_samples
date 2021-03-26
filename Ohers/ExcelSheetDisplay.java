package Ohers;

public class ExcelSheetDisplay {
	
	public static int excelSheetDisplay(String s) {
		if(s == null || s.length() == 0) return 0;
		int number = 0;
		for(int i = 0 ; i < s.length() ; i++) {
			// s = 'A'  =====>   (s.charAt(i) - 'A') ------->> 0 
			int val = (s.charAt(i) - 'A') + 1;
			number = number * 26  + val;
		}
		return number;
	}

	
	public static void main(String[] args) {
		System.out.println(excelSheetDisplay("ZY")); 
	}
}

//
//A - 1
//AA - 27 = 26*1 + 1
//AB - 28 = 26*1 + 2
//AC - 29
//ZY - 701 = 26*26 + 25 