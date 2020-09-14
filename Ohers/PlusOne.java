package Ohers;

public class PlusOne {
	public static int[] plusOne(int[] digits) {
		if(digits.length == 0 ) return null;
		//if the last digit is 9;
		if(digits[digits.length - 1] == 9) {
			// if there is only one element in the array
			if(digits.length == 1) {
				return  new int[]{1, 0};
			}
			else {// check if each digit is having 9 to increment the significant pointer
				for(int i = digits.length-1; i>=0 ; i--) {
					if(digits[i] ==9) {
						digits[i] = 0;
					}
					else {// means it is less than 9.. so just increment
						digits[i] += 1;
						break;// done here.. exit the loop.. since no other elements will change
					}
				}
				
				// check for 99..
				if(digits[0] == 0) {// if the first element is 0
					// create a new array to return .. its either 99 / 999/...
					int[] res = new int[digits.length + 1];
					res[0] = 1;
					return res;
				}
				
			}
		}
		else {
			digits[digits.length - 1] += 1;
		}
		return digits;
	}
	
	public static int[] checkPlusOne(int[] digits) {
		if(digits[digits.length - 1] == 9){
            if(digits.length == 1){
                int[] x = new int[]{1, 0}; 
                return x;  
            } else {
                for(int i = digits.length - 1; i > -1; i--){
                    if(digits[i] < 9){
                        digits[i] = digits[i] + 1;
                        break; 
                    } else {
                        digits[i] = 0; 
                    }
                }
                
                if(digits[0] == 0){
                    int[] x = new int[digits.length + 1]; 
                    x[0] = 1; 
                    return x;
                } else {
                    return digits; 
                }
            }
        } else {
            digits[digits.length - 1] = digits[digits.length - 1] + 1; 
            return digits; 
        }
	}
	
	public static void main(String[] args) {
		int[] a = {0};
		int[] b = {9,9};
		int[] c = {9};
		int[] res = plusOne(c);
		for(int i = 0 ; i < res.length ; i++)
			System.out.println(res[i]);
	}
}
