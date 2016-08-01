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
	        
	        Node maxLeaf = getMaximumSumPathLeaf(tree);
	        
	        int maxValue  = getMaximumLeafValue(tree,maxLeaf);
	        System.out.println("Max Value is "+maxValue);
		
	}

	private static int getMaximumLeafValue(BinaryTree tree, Node maxLeaf) {
		return 0;
	}

	private static Node getMaximumSumPathLeaf(BinaryTree tree) {
		return null;
	}

}
