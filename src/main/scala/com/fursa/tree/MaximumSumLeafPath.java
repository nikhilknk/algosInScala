/**
 * 
 */
package com.fursa.tree;

import com.fursa.common.BinaryTree;
import com.fursa.common.Node;

/**
 * @author nkakkireni
 *
 */
public class MaximumSumLeafPath {
	static int max = Integer.MIN_VALUE;
	static Node targetLeaf = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		 tree.setRoot(new Node(10));
		 
	        tree.getRoot().setLeft(new Node(-1));
	        tree.getRoot().setRight(new Node(7));
	        tree.getRoot().getLeft().setLeft(new Node(8));
	        tree.getRoot().getLeft().setLeft(new Node(-4));
	        
	        getMaximumSumPathLeaf(tree.getRoot(),0);
	        
	        getMaximumLeafPath(tree.getRoot());
	        System.out.println("Max Value is "+max);
		
	}

	private static boolean getMaximumLeafPath(Node node) {
		if(node == null) return false;
		
		if(node == targetLeaf || getMaximumLeafPath(node.getLeft()) || getMaximumLeafPath(node.getRight())){
			System.out.println(node.getValue());
			return true;
		}
		return false;
	}

	private static void getMaximumSumPathLeaf(Node node,int current) {
		if(node == null) return;
		
		current += node.getValue();
		if(node.getRight() == null && node.getLeft() == null){
			if(max < current){
				targetLeaf = node;
				max = current;
			}
				
		}
		getMaximumSumPathLeaf(node.getLeft(),current);
		getMaximumSumPathLeaf(node.getRight(),current);
	}

}
