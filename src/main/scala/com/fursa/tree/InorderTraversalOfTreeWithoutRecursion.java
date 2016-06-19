/**
 * 
 */
package com.fursa.tree;

import java.util.Stack;

import com.fursa.common.Node;
import com.fursa.common.BinaryTree;

/**
 * @author nkakkireni
 *
 */
public class InorderTraversalOfTreeWithoutRecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		
		tree.setRoot(new Node(10));
		tree.getRoot().setLeft(new Node(8));
		tree.getRoot().setRight(new Node(2));
		tree.getRoot().getLeft().setLeft(new Node(3));
		tree.getRoot().getLeft().setRight(new Node(5));
		tree.getRoot().getRight().setLeft(new Node(2));
		
		inorder(tree);

	}

	private static void inorder(BinaryTree tree) {
			Stack stack = new Stack();
			Node node =  tree.getRoot();
			stack.push(node);
			
			while(!stack.isEmpty()){
				Node topElement =  (Node) stack.peek();
				System.out.println(topElement.getValue());
				stack.pop();
				if(topElement.getRight() != null)
					stack.push(topElement.getRight());
				if(topElement.getLeft() != null)
					stack.push(topElement.getLeft());
			}
	}

}
