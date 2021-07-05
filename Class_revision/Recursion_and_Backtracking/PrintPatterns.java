package Class_revision.Recursion_and_Backtracking;

public class PrintPatterns {
	
	
	public static void printAllStarPattern(int n, int i, int col) {
		
		// base case
		if(i >= n) return;
		
		if(col <= i) {
			System.out.print("* ");
			printAllStarPattern(n, i, col+1);
		}
		/*for(int c = 0 ; c <= i ; c++) { // using loop
			System.out.print("* ");
		}*/
		else {
			System.out.println("");
			printAllStarPattern(n, i+1, 0);
		}
	}

	public static void main(String[] args) {
		printAllStarPattern(4, 0, 0);
	}
}
