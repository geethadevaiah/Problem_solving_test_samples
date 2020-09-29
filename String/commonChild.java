package String;

public class commonChild {

	/** Classic Dynamic Programming
		with the matrix
		bottom up approach
		if both first chars equal then copy previous vertical diagonal
		else max(previous, top)
	 */
	
	public static int getTheCommonChild(String s1, String s2) {
		char[] A = s1.toCharArray(), B = s2.toCharArray();
		int lenA = s1.length(), lenB = s2.length();
		int[][] dp = new int[lenA + 1][lenB + 1];
		
		// apply the cases
		for(int i = 1; i <= lenA ; i++) {
			for(int j = 1 ; j <= lenB ; j++) {
				if(A[i-1] == B[j-1]) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		return dp[lenA][lenB];
		
	}
	
	public static void main(String[] args) {
		System.out.println(getTheCommonChild("SHINCHAN", "NOHARAAA"));
	}
}
