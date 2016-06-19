/**
 * 
 */
package com.fursa.stack;

import java.util.ArrayList;

import com.fursa.common.StackImplementation;

/**
 * @author nkakkireni
 *
 */
public class SortStackWithRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StackImplementation<Integer> stack  = new StackImplementation<Integer>();

		stack.add(-3);
		stack.add(14);
		stack.add(18);
		stack.add(-5);
		stack.add(30);

		System.out.println(stack.toString());

		sortStackUsingRecursion(stack);

		System.out.println("After :::"+stack.toString());
	}

	private static void sortStackUsingRecursion(
			StackImplementation<Integer> stack) {

		if(!stack.isEmpty()){
			int temp = stack.pop();
			sortStackUsingRecursion(stack);
			sortedInsert(stack,temp);
		}
	}

	private static void sortedInsert(StackImplementation<Integer> stack,int value){
		if(stack.isEmpty() || stack.top() <value)
		{
			stack.push(value);
			return;
		}
		else{
			int temp = stack.pop();
			sortedInsert(stack,value);
			stack.push(temp);
		}
	}

}
