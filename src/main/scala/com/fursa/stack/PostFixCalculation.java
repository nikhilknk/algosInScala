/**
 * 
 */
package com.fursa.stack;

import java.util.Stack;
import java.util.regex.Pattern;

/**
 * @author Swetha
 *
 */
public class PostFixCalculation {


	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String calcString = "6 5 9 - 4 + /";
		Stack<Integer> stack = new Stack<Integer>();
		Pattern isNumber = Pattern.compile("^\\d+?$");
		
		//Split the string
		String tokens[] = calcString.split("\\s+?");
		
		for(int i =0;i<tokens.length;i++){
			if(isNumber.matcher(tokens[i].trim()).matches()){
				stack.push(Integer.parseInt(tokens[i].trim()));
			}else if(tokens[i].trim().equals("+")){
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b+a);
			}
			else if(tokens[i].trim().equals("-")){
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b-a);
			}else if(tokens[i].trim().equals("*")){
				int a = stack.pop();
				int b = stack.pop();
				stack.push(b*a);
			}else if(tokens[i].trim().equals("/")){
				int a = stack.pop();
				int b = stack.pop();
				if(a==0) throw new Exception("Divisor is zero");
				else {stack.push(b/a);}
			}else
				throw new Exception("Unknown Synbol Found");
		}
		
		System.out.println("result is ::"+stack.pop());
		
	}

}
