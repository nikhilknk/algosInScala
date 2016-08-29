package com.fursa.common;
public class DNode{
	private DNode left;
	private DNode right;
	private int value;
	public DNode getLeft() {
		return left;
	}
	public void setLeft(DNode left) {
		this.left = left;
	}
	public DNode getRight() {
		return right;
	}
	public DNode(int value) {
		super();
		this.value = value;
		this.count=0;
		this.left=null;
		this.right=null;
	}
	public void setRight(DNode right) {
		this.right = right;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	private int count;

}