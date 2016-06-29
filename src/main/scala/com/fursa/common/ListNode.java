/**
 * 
 */
package com.fursa.common;

/**
 * @author nkakkireni
 *
 */
public class ListNode {
	int value;
	ListNode next;
	
	public ListNode(int i) {
		value = i;
		next =null;
	}
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	/**
	 * @return the next
	 */
	public ListNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(ListNode next) {
		this.next = next;
	}
}
