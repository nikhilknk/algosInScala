/**
 * 
 */
package com.fursa.common;

/**
 * @author nkakkireni
 *
 */
public class Node {
	private int value;
	private Node left;
	private Node right;
	public Node(int val){
		value = val;
		left = null;
		right = null;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
}
