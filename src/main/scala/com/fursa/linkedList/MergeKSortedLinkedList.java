/**
 * 
 */
package com.fursa.linkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

import com.fursa.common.LinkedList;
import com.fursa.common.ListNode;

/**
 * @author nkakkireni
 *
 */
public class MergeKSortedLinkedList {
	public static void main(String[] args) {
		LinkedList linkedList1 = new LinkedList();
		LinkedList linkedList2 = new LinkedList();
		LinkedList linkedList3 = new LinkedList();
		linkedList1.addInTheEnd(new ListNode(1));
		linkedList1.addInTheEnd(new ListNode(10));
		linkedList1.addInTheEnd(new ListNode(20));
		linkedList1.addInTheEnd(new ListNode(40));
		
		linkedList2.addInTheEnd(new ListNode(5));
		linkedList2.addInTheEnd(new ListNode(15));
		linkedList2.addInTheEnd(new ListNode(25));
		linkedList2.addInTheEnd(new ListNode(45));
		
		linkedList3.addInTheEnd(new ListNode(14));
		linkedList3.addInTheEnd(new ListNode(17));
		linkedList3.addInTheEnd(new ListNode(28));
		linkedList3.addInTheEnd(new ListNode(49));
		
		List<ListNode> lists = new ArrayList<ListNode>();
		lists.add(linkedList1.getHead());
		lists.add(linkedList2.getHead());
		lists.add(linkedList3.getHead());
		
		System.out.println("first list: ");linkedList1.printList();
		System.out.println("second list: ");linkedList2.printList();
		System.out.println("third list: ");linkedList3.printList();
		
		System.out.println("Output list is: ");
		ListNode result = getMergedLists(lists);
		while (result !=null) {
			System.out.println(result.getValue());
			result = result.getNext();
		}
	}

	private static ListNode getMergedLists(List<ListNode> lists) {
		if(lists != null && lists.size() > 0 ){
			
			ListNode head = new ListNode(0);
			ListNode current = head;
			PriorityQueue priorityQueue = new PriorityQueue<ListNode>(new Comparator<ListNode>() {

				public int compare(ListNode o1, ListNode o2) {
					return	o1.getValue()-o2.getValue();
				}
			});
			
			for (ListNode list: lists) {
				if(list!=null)
				  priorityQueue.offer(list);
			}
			
			while(!priorityQueue.isEmpty()){
				ListNode node = (ListNode) priorityQueue.poll();
				ListNode nextNode = node.getNext();
				if(nextNode != null){
					priorityQueue.offer(nextNode);
				}
				current.setNext(node);
				current = current.getNext();
			}
			return head.getNext();
		}
		return null;
	}
}
