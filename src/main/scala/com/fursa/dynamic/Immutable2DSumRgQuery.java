/**
 * 
 */
package com.fursa.dynamic;

/**
 * @author Swetha
 *
 */
public class Immutable2DSumRgQuery {
	public static void main(String[] args) {
		int[][] input = {{2,0,-3,4}, {6, 3, 2, -1}, {5, 4, 7, 3}, {2, -6, 8, 1}};
		int[][] temp = initalize(input);
		System.out.println(sumQuery(temp,0, 0, 0, 2));
	}

	private static int[][] initalize(int[][] input) {
		int[][] T = new int[input.length+1][input[0].length+1];
		for(int i =1;i<T.length;i++)
		{
			for(int j =1;j<T[0].length;j++)
			{
				T[i][j] = T[i-1][j]+T[i][j-1]-T[i-1][j-1]+input[i-1][j-1];
			}
		}
		return T;
	}

	private static int sumQuery(int[][] T,int i, int j, int k, int l) {
		return T[i+1][j+1]-T[i][j]+T[i+1][j]+T[i][j+1];
	}
}
