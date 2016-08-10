/**
 * 
 */
package com.fursa.strings;

import java.util.Stack;

/**
 * @author nkakkireni
 *
 */
public class CheckDuplicateParanthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(duplicateParenthesis("({a+b}) + ((c+d))"));
	}
	/**
	 * 
	 * @param s
	 * @return
	 */
	public static boolean duplicateParenthesis(String s)

	{
		Stack<Character> st = new Stack<Character>();
		for (int j = 0; j < s.length(); j++) {
			if(s.charAt(j)=='(' || s.charAt(j)=='[' || s.charAt(j)=='{'){
				st.push(s.charAt(j));
			}else if(s.charAt(j)==')' || s.charAt(j)==']' || s.charAt(j)=='}'){
				if(st.isEmpty() || !arePairs(st.peek(),s.charAt(j))) return false;
				else st.pop();
			}
		}

		return st.isEmpty() ?  true : false;

	}
	/***
	 * 
	 * @param start
	 * @param end
	 * @return
	 */
	private static boolean arePairs(char start, char end) {
		if(start == '(' && end == ')') return true;
		if(start == '[' && end == ']') return true;
		if(start == '{' && end == '}') return true;
		return false;
	}

}
