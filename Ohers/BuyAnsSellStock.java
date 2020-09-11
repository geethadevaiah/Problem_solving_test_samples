package Ohers;

public class BuyAnsSellStock {
 
	/** find like graph points for low and peak.. 
	 * subtract from each and sum up for max profit
	 * @param prices
	 * @return
	 */
	
	public static int maxProfit(int[] prices) {
		int i = 0, profit = 0;
		int peak = prices[0], low = prices[0];
		int n = prices.length;
		while(i < n - 1) {
			// finding the lowest point
			// like decreasing slop.. find the lowest point
			while(i < n -1 && prices[i] >= prices[i + 1]) {
				i++;
			}
			low = prices[i];
			// find the peak
			while(i < n - 1 && prices[i] <= prices[i+1])
				i++;
			peak = prices[i];
			profit = profit + (peak - low);
		}
		return profit;
	}
	
	public static void main(String[] args) {
		int[] in = {7,1,5,3,6,4};
		System.out.println(maxProfit(in));
	}
}
