/**
 * 
 */
package com.fursa.arrays;

/**
 * @author nkakkireni
 *
 */
public class MaxCircularSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 int a[] =  {11, 10, -20, 5, -3, -5, 8, -13, 10};
         System.out.println("Maximum circular sum is " +
                         maxCircularSum(a));	}

	private static int maxCircularSum(int[] a) {

		int maxSumSOfar = a[0];
		int maxSumInlcuingCurrent = a[0];
		for (int i = 1; i < a.length-1; i++) {
			int p = maxSumInlcuingCurrent + a[i];
			if(p<0){
				maxSumInlcuingCurrent = p;
			}
			else if(maxSumInlcuingCurrent>maxSumSOfar)
				maxSumSOfar = maxSumInlcuingCurrent;
				
		}
		return 0;
	}

}
