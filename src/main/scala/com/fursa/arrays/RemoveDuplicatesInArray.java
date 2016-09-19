/**
 * 
 */
package com.fursa.arrays;

import java.util.Arrays;

/**
 * @author Swetha
 *
 */
public class RemoveDuplicatesInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] arrayInteger = {1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8};
		int j = 1;
		int i = 0;
		
		while(j<arrayInteger.length){
			if(arrayInteger[i]==arrayInteger[j])
				j++;
			else{
				i++;
				arrayInteger[i] = arrayInteger[j];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(Arrays.copyOf(arrayInteger, i + 1)));
	}

}
