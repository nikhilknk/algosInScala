/**
 * 
 */
package com.fursa.dynamicProgramming;

/**
 * @author nkakkireni
 *
 */
public class CoinChangingProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] coins = {1,5,6,8};
		int number = 15;
		int[][] T = new int[coins.length+1][number+1];
		T[0][0] = 0;
		for(int i = 0;i<=number;i++){
			T[0][i] =  Integer.MAX_VALUE;
		}
		for(int i = 0;i<=coins.length;i++){
			T[i][0] =  0;
		}
		
		
		for(int i = 1;i<=coins.length;i++){
			for (int j =1;j<=number;j++){
				if(j<coins[i-1]){
					T[i][j] = T[i-1][j];
				}else{
						T[i][j] = Math.min(T[i][j-coins[i-1]]+1,T[i-1][j]);
				}
			}
		}
		System.out.println("minimum number of coins required are"+T[coins.length][number]);
	}

}
