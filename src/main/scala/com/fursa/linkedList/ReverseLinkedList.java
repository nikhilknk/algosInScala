/**
 * 
 */
package com.fursa.linkedList;

import com.fursa.common.LinkedList;
import com.fursa.common.ListNode;


/**
 * @author nkakkireni
 *
 */
public class ReverseLinkedList {
	static ListNode head=null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
        // Creating the linkedlist
        for (int i = 5; i > 0; i--) {
            list.add(new ListNode(i));
        }
        System.out.println("Before reverse:: ");
        list.printList();
        //ListNode nextNode = reverseLinkedListUsingRecursion(list.getHead());
        //ListNode nextNode = reverseLinkedListUsingRecursion(list.getHead());
        ListNode nextNode = reverseLinkedListUsingTailRecursion(list.getHead(),null);
        list.setHead(nextNode);
        System.out.println("After reverse:: ");
        list.printList();
	}

	private static ListNode reverseLinkedListUsingTailRecursion(ListNode current,
			ListNode prev) {
		
		if(current.getNext() == null){
			head = current;
			current.setNext(prev);
			return null;
		}
		ListNode next = current.getNext();
		current.setNext(prev);
		reverseLinkedListUsingTailRecursion(next, current);
		return head;
	}

	private static ListNode reverseLinkedListUsingIteration(ListNode node) {
		ListNode prev = node;
		ListNode current = node.getNext();
		while (current!=null) {
			prev.setNext(current.getNext());
			current.setNext(prev);
			current= current.getNext();
			prev= current;
		}
		return current;
	}

	private static ListNode reverseLinkedListUsingRecursion(ListNode current) {
		ListNode nextNode =  current.getNext();
		if(current == null || nextNode == null) return current;
		
		ListNode remaining = reverseLinkedListUsingRecursion(current.getNext());
		
		nextNode.setNext(current);
		current.setNext(null);
		return remaining;
		
	}

	

}
