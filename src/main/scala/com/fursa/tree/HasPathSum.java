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
public class HasPathSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.setRoot(new Node(30));

		tree.getRoot().setLeft(new Node(10));
		tree.getRoot().setRight(new Node(60));
		tree.getRoot().getLeft().setLeft(new Node(5));
		tree.getRoot().getLeft().setLeft(new Node(20));
		tree.getRoot().getRight().setLeft(new Node(40));
		tree.getRoot().getRight().setLeft(new Node(70));
		
		boolean leaf = pathSum(tree.getRoot(),30);
		
		if(leaf)
			System.out.println("Yes there is sum from root to leaf");
		else 
			System.out.println("No...Dear");

	}

	private static boolean pathSum(Node root, int i) {

		if(root == null) return i==0;
		else{
			boolean ans = false;
			if(root.getValue() == i && isLeaf(root))
				return true;
			if(root.getLeft() != null){
				ans = ans || pathSum(root.getLeft(), i-root.getValue());
			}
			
			if(root.getRight() != null){
				ans =  ans || pathSum(root.getRight(), i-root.getValue());
			}
			
			return ans;
		}
	}
	
	private static boolean isLeaf(Node root){
		if(root.getLeft() == null && root.getRight() == null)
			return true;
		return false;
	}

}
