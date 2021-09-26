package IntrvwQ;

public class Sample1 {

	
	public static void sortNumbers(int[] arr) {
		
		int tmp = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			for(int j = 0 ; j <  i ; j++) {
				
				if(arr[i] < arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {90, 112, 71, 70,10,20};
		
		sortNumbers(arr);
		
		for(int i =0  ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
