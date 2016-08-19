/**
 * 
 */
package com.fursa.tree;

import com.fursa.common.BinaryTree;
import com.fursa.common.Node;

/**
 * @author Swetha
 *
 */
public class IsTreeBinarySearchTree {
	
	static Node prev = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree= new BinaryTree();
		tree.setRoot(new Node(10));
		tree.getRoot().setLeft(new Node(7));
		tree.getRoot().setRight(new Node(14));
		
		tree.getRoot().getLeft().setLeft(new Node(4));
		tree.getRoot().getLeft().setRight(new Node(9));
		
		tree.getRoot().getRight().setLeft(new Node(12));
		tree.getRoot().getRight().setRight(new Node(20));
		
		boolean isBST = isBinarySearchTree(tree.getRoot());
		
		if(isBST)
			System.out.println("Tree is Binary search tree");
		else
			System.out.println("Tree is not Binary search tree");
	}

	private static boolean isBinarySearchTree(Node root) {
		return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	private static boolean isBST(Node node, int minValue, int maxValue) {
		if(node == null) return true;
		
		if(node.getValue() > maxValue || node.getValue() < minValue)
			return false;
		
		return isBST(node.getLeft(), minValue, node.getValue()-1) && isBST(node.getRight(), node.getValue()+1, maxValue);
			
		
	}

	/*private static boolean isBinarySearchTree(Node node) {
		
		if(node != null){
			if(!isBinarySearchTree(node.getLeft()))
				return false;
			
			if(prev != null && prev.getValue() >= node.getValue()){
				return false;
			}
			
			prev = node;
			
			return isBinarySearchTree(node.getRight());
		}
		return true;
	}
*/
}
