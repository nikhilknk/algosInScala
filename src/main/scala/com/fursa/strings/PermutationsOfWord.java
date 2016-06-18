/**
 * 
 */
package com.fursa.strings;

import java.util.HashMap;
import java.util.Map;



/**
 * @author nkakkireni
 *
 */
public class PermutationsOfWord {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputString = "ABCC";
		Map<String, Integer> trackMap = new HashMap<String, Integer>();
		System.out.println("Started printing Permutations of a word ");
		printAllPermutations(inputString,0,inputString.length()-1,trackMap);
	}
	/**
	 * 
	 * @param inputString
	 * @param left
	 * @param right
	 * @param trackMap
	 */
	private static void printAllPermutations(String inputString, int left, int right,
			Map<String, Integer> trackMap) {
		if(left==right){
			if(!trackMap.containsKey(inputString)){
				trackMap.put(inputString,1);
				System.out.println(inputString.toString());
			}
			return;
		}else{
			for (int i = left; i <= right; i++) {
				if(i != left && inputString.charAt(i) == (inputString.charAt(left))) {continue ;}
				else{
					inputString = swapLettersOfString(inputString,left,i);
					printAllPermutations(inputString,left+1,right,trackMap);
					inputString = swapLettersOfString(inputString,left,i);	
				}
				
			}

		} 
	}
	/**
	 * 
	 * @param inputString
	 * @param i
	 * @param j
	 * @return
	 */
	private static String swapLettersOfString(String inputString, int i, int j) {
		char[] ch=inputString.toCharArray();
		char temp  = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return new String(ch);
	}
}

