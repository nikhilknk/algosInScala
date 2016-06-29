/**
 * 
 */
package com.fursa.common;

/**
 * @author nkakkireni
 *
 */
public class LinkedList {
	/**
	 * @param head the head to set
	 */
	public ListNode setHead(ListNode head) {
		this.head = head;
		return this.head;
	}

	ListNode head;
	
	public void addInTheEnd(ListNode node) {
		if(head == null)
			head = node;
		else{
			ListNode current = head;
			while(current.next != null){
				current = current.next;
			}
			current.next = node;
		}
			
	}
	
	public void add(ListNode node){
		node.setNext(head);
		head = node;
	}

	/**
	 * @return the head
	 */
	public ListNode getHead() {
		return head;
	}
	
	public int size(){
		int i = 1;
		ListNode current = head;
		while(current.next != null){
			current = current.next;
			i++;
		}
		return i;
	}
	
	public void printList(){
		ListNode current = head;
		System.out.println(current.getValue());
		while(current.next != null){
			current = current.next;
			System.out.println(current.getValue());
		}
	}
}
