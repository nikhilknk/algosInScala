package com.fursa.linkedList;

import com.fursa.common.LinkedList;
import com.fursa.common.ListNode;
import com.fursa.common.Node;

public class LinkedListToCompleteBST {
	
	static ListNode head;
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(new ListNode(7));
		linkedList.add(new ListNode(6));
		linkedList.add(new ListNode(5));
		linkedList.add(new ListNode(4));
		linkedList.add(new ListNode(3));
		linkedList.add(new ListNode(2));
		linkedList.add(new ListNode(1));
		head = linkedList.getHead();
		Node root = convertToBST(linkedList.size());
		preOrder(root);
	}
	
	private static Node convertToBST(int n) {
		if(n<=0) return null;
		
		
		Node left = convertToBST(n/2);
		Node root = new Node(head.getValue());
		head = head.getNext();
		root.setLeft(left);
		Node right = convertToBST(n-n/2-1);
		root.setRight(right);
		return root;
	}
	
	private static void preOrder(Node root){
		if(root == null) return;
		System.out.println(root.getValue());
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
}
