/**
 * 
 */
package com.fursa.dynamic;

/**
 * @author Swetha
 *
 */
public class StockBuySellKTransactions {
	public static void main(String[] args) {
		int prices[] = {2, 5, 7, 1, 4, 3, 1, 3};
		System.out.println("Max profit fast solution " + maxProfit(prices, 3));
	}

	private static Integer maxProfit(int[] prices, int k) {
		if(k == 0 || prices.length==0)
			return 0;
		
		int T[][] = new int[k+1][prices.length];
		
		for (int i = 1; i < T.length; i++) {
			int maxTemp = -prices[0];
			for (int j = 1; j < T[0].length; j++) {
				T[i][j] = Math.max(T[i][j-1], maxTemp+prices[j]);
				maxTemp = Math.max(maxTemp,T[i-1][j]-prices[j]);
						
			}
		}
		
		return T[k][prices.length-1];
		
	}
}
