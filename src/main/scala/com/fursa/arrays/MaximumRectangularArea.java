/**
 * 
 */
package com.fursa.arrays;

import java.util.Stack;

/**
 * @author Swetha
 *
 */
public class MaximumRectangularArea {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[]  numbers = {2,1,2};
		int maxArea = getMaxArea(numbers);
		System.out.println("Max area is :::"+maxArea);
	}

	private static int getMaxArea(int[] numbers) {
		Stack<Integer> stack = new Stack<Integer>();
		int area,maxArea=0;
		int top = -1;int i;
				System.out.println(top);
		for(i =0;i<numbers.length;){
			if(stack.isEmpty() || numbers[stack.peek()]< numbers[i]){
				stack.push(i++);
			}
			else{
				top = stack.pop();
				if(stack.isEmpty())
					area = numbers[top]*i;
				else
					area = numbers[top] *(i-stack.peek()-1);
				maxArea = Math.max(area,maxArea);
			}
		}
		while(!stack.isEmpty()){
			top = stack.pop();
			if(stack.isEmpty())
				area = numbers[top]*i;
			else
				area = numbers[top] *(i-stack.peek()-1);
			maxArea = Math.max(area,maxArea);	
		}
		return maxArea;
	}

}
