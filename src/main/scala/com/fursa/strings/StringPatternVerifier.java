/**
 * 
 */
package com.fursa.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author nkakkireni
 *
 */
public class StringPatternVerifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(doesStringHasPattern("abcabc"));
	}
	/***
	 * 
	 * @param givenString
	 * @return
	 */
	static boolean doesStringHasPattern(String givenString) {
		boolean doesStringHasPattern=false;

		for (int i = 2; i < givenString.length(); i++) {
			Set<String> s = new HashSet<String>();
			String[] temp = givenString.split("(?<=\\G.{"+i+"})");
			s.addAll(Arrays.asList(temp));

			if(s.size() == 1){
				doesStringHasPattern = true;
				break;
			}

		}

		return doesStringHasPattern;
	}

}
