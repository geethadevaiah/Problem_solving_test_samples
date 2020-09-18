package Ohers;

public class BuyAnsSellStockOnlyOnce {
 	public static int maxProfit(int[] prices) {
		// two pointer for low price and high given i < n 
 		int lowPrice = Integer.MAX_VALUE;
 		int maxProfit = 0;
 		
 		for(int i = 0 ; i < prices.length ; i++) {
 			if(prices[i] < lowPrice) {
 				lowPrice = prices[i];
 			}
 			else if(maxProfit < (prices[i] - lowPrice)) {
 				maxProfit = prices[i] - lowPrice;
 			}
 		}
 		return maxProfit;
		
	}
	
	public static void main(String[] args) {
		int[] in = {7,1,5,3,6,4};
		System.out.println(maxProfit(in));
	}
}
