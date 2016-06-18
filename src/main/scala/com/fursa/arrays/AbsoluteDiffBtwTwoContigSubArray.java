/**
 * 
 */
package com.fursa.arrays;

import java.util.Arrays;

/**
 * @author nkakkireni
 *
 */
public class AbsoluteDiffBtwTwoContigSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		findMaxAbsDiff(a);
	}

	private static void findMaxAbsDiff(int[] a) {
		int  invertedArray[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			invertedArray[i] = -a[i];
		}
		int maxLeftArray[] = getMaxLeftArray(a);
		int minLeftArray[] = getMaxLeftArray(invertedArray);
		for (int i = 0; i < minLeftArray.length; i++) {
			minLeftArray[i] = -minLeftArray[i];
		}
		
		 
		int maxRightArray[] = getMaxRightArray(a);
		int minRightArray[] = getMaxRightArray(invertedArray);
		for (int i = 0; i < minRightArray.length; i++) {
			minRightArray[i] = -minRightArray[i];
		}
		int maxSoFar = 0;
		
		System.out.println("maxLeftArray::"+Arrays.toString(maxLeftArray));
		System.out.println("minLeftArray::"+Arrays.toString(minLeftArray));
		System.out.println("maxRightArray::"+Arrays.toString(maxRightArray));
		System.out.println("minRightArray::"+Arrays.toString(minRightArray));
		
		
		
		for(int i=1;i<a.length;i++){
			int diff = Math.max(Math.abs(maxLeftArray[i]-minRightArray[i]), Math.abs(maxRightArray[i]-minLeftArray[i]));
			if(maxSoFar < diff) maxSoFar = diff;
		}
		
		System.out.println("Max abs difference is ::" + maxSoFar);
	}
	
	static int[] getMaxLeftArray(int[] a){
		int maxSofar = a[0];
		int maxCurrent = a[0];
		
		int maxLeft[] = new int[a.length];
		maxLeft[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			maxCurrent = Math.max(a[i], a[i] + maxCurrent);
			maxSofar = Math.max(maxSofar,maxCurrent);
			maxLeft[i] = maxSofar;
		}
		return maxLeft;
		
	}

	static int[] getMaxRightArray(int[] a){
		
		int maxSofar = a[a.length-1];
		int maxCurrent = a[a.length-1];
		int maxLeft[] = new int[a.length];
		
		for (int i = a.length-2; i >=0; i--) {
			maxCurrent = Math.max(a[i], a[i] + maxCurrent);
			maxSofar = Math.max(maxSofar,maxCurrent);
			maxLeft[i] = maxSofar;
		}
		return maxLeft;
		
	}
}
