/**
 * 
 */
package com.fursa.tree;

/**
 * @author Swetha
 *
 */
public class CountOfBinarySearchTree {	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int[] T = new int[numbers.length+1];
		T[0]=1;
		T[1] = 1;
		T[2]=2;
		for (int  i=3; i < T.length;i ++) {
			for (int j = 0; j < i; j++) {
				T[i] += T[j]*T[i-j-1];
			}
		}
		System.out.println("Number of binary search trees::"+T[numbers.length]);
	}

}
