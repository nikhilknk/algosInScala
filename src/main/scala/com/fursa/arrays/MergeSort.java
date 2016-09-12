/**
 * 
 */
package com.fursa.arrays;

import java.util.Arrays;

/**
 * @author Swetha
 *
 */
public class MergeSort {
	private int[] num;
	private int[] tempArray;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] nums = {2,1,3,4,8,7,6,5};
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(nums);
		
	}

	public void sort(int nums[]) {
        this.num = nums;
        this.tempArray = new int[nums.length];
        doMergeSort(0, nums.length - 1);
        System.out.println(Arrays.toString(num));
    }
	
	private void doMergeSort(int low, int high) {
		
		if(low>=high)return;
			
		int mid = (low+high)/2;
		
		doMergeSort(low,mid);
		
		doMergeSort(mid+1,high);
		
		merge(low,mid,high);
	}

	private void merge(int low, int mid, int high) {

		for(int i= low;i<=high;i++){
			tempArray[i] = num[i];
		}
		
		int i = low;
		int j = mid+1;
		int k = low;
		
		while(i <= low && j <= high){
			if(tempArray[i]<tempArray[j]){
				num[k]=tempArray[i];
				i++;
			}
			else{
				num[k]=tempArray[j];
				j++;
			}
			k++;
		}
		
		while(i<=low){
			num[k]=tempArray[i];
			k++;
			i++;
		}
	}

}
