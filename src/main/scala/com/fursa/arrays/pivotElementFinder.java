/**
 * 
 */
package com.fursa.arrays;

import java.util.Arrays;


/**
 * @author nkakkireni
 *
 */
public class pivotElementFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int arr[] = {5, 1, 4, 3, 6, 8, 10, 7, 9};
		 findElement(arr);
	}

	private static void findElement(int[] arr) {
		if (arr.length ==0 ) { System.out.println("Size of Array is zero ...please check !!"); return; }
		
		if (arr.length ==1 ){ System.out.println("Pivot element is ::" + arr[0]); return; } 
		
		int leftMax[] = new int[arr.length];
		Arrays.fill(leftMax, -1);
		leftMax[0] =arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			leftMax[i] = Math.max(leftMax[i-1], arr[i-1]);
			
		}
		int rightMin = arr[arr.length-1];
		
		for (int i = arr.length-2; i  >=  0; i--) {
			if(arr[i] > leftMax[i] && arr[i] < rightMin) System.out.println("found element ::"+arr[i]);
			
			rightMin =  Math.min(rightMin, arr[i]);
			
		}
		
	}

}
