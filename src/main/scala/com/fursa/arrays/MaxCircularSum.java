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
		 int a[] =  {11, 10, -20, 5, -3, -5, 8, -13};
         System.out.println("Maximum circular sum is " +
                         maxCircularSum(a));	}

	private static int maxCircularSum(int[] a) {

		int maxSumExcludingEdges = getMaxSum(a);
		System.out.println(maxSumExcludingEdges);
		int negativeArray[] = new int[a.length];
		int totalSum= 0;
		for (int i = 0; i < a.length; i++) {
			negativeArray[i] = -a[i];
			totalSum += a[i]; 
		}
		
		int maxSumOnlyEdges = getMaxSum(negativeArray)+totalSum;
		System.out.println(maxSumOnlyEdges+":::"+totalSum);
		return Math.max(maxSumExcludingEdges,maxSumOnlyEdges);
		
	}

	private static int getMaxSum(int[] a) {
		int maxSumSOfar = a[0];
		int maxSumInlcuingCurrent = a[0];
		for (int i = 1; i < a.length; i++) {
			maxSumInlcuingCurrent = Math.max(a[i], maxSumInlcuingCurrent+a[i]);
			maxSumSOfar = Math.max(maxSumSOfar, maxSumInlcuingCurrent);
		}
		return maxSumSOfar;	}

}
