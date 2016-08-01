/**
 * 
 */
package com.fursa.arrays;

import scala.Array;

/**
 * @author nkakkireni
 *
 */
public class RotateArrayByNSteps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5, 6, 7,8,9,10,11,12};
		printArray(array);
		rotateArray(array,3);
		System.out.println("After rotation::");
		printArray(array);
	}

	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	private static void rotateArray(int[] array, int d) {
		for (int i = 0; i < gcd(array.length,d); i++) {
			int temp =  array[i];
			int j = i;
			while(true){
				int k = j+d;
				if(k>=array.length) k = k-array.length;
				if(k==i) break;
				array[j]=array[k];
				j= k;
			}
			array[j] = temp;
		}
	}

	private static int gcd(int a, int b) {
		if(b==0) return a ;
		return gcd(b,a%b);
	}

}
