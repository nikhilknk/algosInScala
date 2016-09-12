/**
 * 
 */
package com.fursa.arrays;

/**
 * @author Swetha
 *
 */
public class QuickSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {2,1,3,4,8,7,6,5};
		quickSort(num,0,num.length-1);
	}

	private static void quickSort(int[] num, int low, int high) {
		if (num == null || num.length == 0)
			return;
		
		if(high<=low) return;
		
		int i = low;
		int j = high;
		int pivot = (i+j)/2;
		
		while(i<=j){
			
			while(num[i]<num[pivot])
				i++;
			
			while(num[j]>num[pivot])
				j--;
			
			if(i<=j){
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
				i++;
				j--;
			}
		}
		
		if(j>low) quickSort(num,low,j);
		
		if(i<high) quickSort(num,i,high);
	}

}
