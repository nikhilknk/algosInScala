/**
 * 
 */
package com.fursa.tree;

import com.fursa.common.DNode;

/**
 * @author Swetha
 *
 */
public class DuplicateBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DNode root = null;
		root = insert(root,12);
		root = insert(root,10);
		root = insert(root,20);
		root = insert(root,9);
		root = insert(root,11);
		root = insert(root,10);
		root = insert(root,12);
		root = insert(root,12);
		System.out.println("Starting");
		inorder(root);
		System.out.println("Deleting 20");
		root = deleteNode(root,20);
		
		inorder(root);
		System.out.println("Deleting 12");
		root = deleteNode(root,12);
		
		inorder(root);
		System.out.println("Deleting 9");
		root = deleteNode(root,9);
		
		inorder(root);
	}

	private static DNode deleteNode(DNode root, int i) {
		if(root==null) return root;
		
		if(root.getValue()>i){
			root.setLeft(deleteNode(root.getLeft(), i));
		}else if(root.getValue()<i)
		{
			root.setRight(deleteNode(root.getRight(), i));
		}else
		{
			if(root.getCount()>1){
				root.setCount(root.getCount()-1);
				return root;
			}
			
			if(root.getLeft() == null)
			{
				return root.getRight();
			}else if(root.getRight()==null){
				return root.getLeft();
			}
		
			DNode temp = minNodeInRight(root.getRight());
			root.setValue(temp.getValue());
			root.setRight(deleteNode(root.getRight(),i));
		}
		return root;
	}

	private static DNode minNodeInRight(DNode root) {
		while(root.getLeft()!=null)
		{
			root = root.getLeft();
		}
		return root;
	}

	private static DNode insert(DNode root, int i) {
		
		if(root==null)
			root = new DNode(i);
		
		if(root.getValue()==i)
			root.setCount(root.getCount()+1);
		
		 
		
		if(root.getValue() > i){
			root.setLeft(insert(root.getLeft(),i));
		}else if(root.getValue() < i){
			root.setRight(insert(root.getRight(),i));
		}
		
		return root;
	}

	private static void inorder(DNode root) {
		if(root == null) return ;
		
		inorder(root.getLeft());
		
		System.out.println(root.getValue()+"::"+root.getCount());
		inorder(root.getRight());
	}
	
	

}
