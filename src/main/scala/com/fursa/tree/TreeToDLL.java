package com.fursa.tree;

import com.fursa.common.BinaryTree;
import com.fursa.common.Node;

public class TreeToDLL {
	public static Node prev=null;
	public static Node head=null;
	
    public static void main(String[] args) {

    	BinaryTree root = getTree();
           convertToDll(root.getRoot());
           printList(head);
    }
    
    private static void convertToDll(Node root) {
    	
    	if(root==null) return;
    	
    	convertToDll(root.getLeft());
    	
    	if(prev==null)
    	{
    		head=root;
    	}else{
    		prev.setRight(root);
    		root.setLeft(prev);
    	}
    	
    	prev = root;
    	convertToDll(root.getRight());
    	
	}

	public static BinaryTree getTree() {
    	BinaryTree tree = new BinaryTree();
		tree.setRoot(new Node(40));

		tree.getRoot().setLeft(new Node(15));
		tree.getRoot().setRight(new Node(50));
		tree.getRoot().getLeft().setLeft(new Node(5));
		tree.getRoot().getLeft().setRight(new Node(20));
		tree.getRoot().getRight().setLeft(new Node(45));
		tree.getRoot().getRight().setRight(new Node(70));

           return tree;
    }

    public static void printList(Node  node)
        {
            while (node != null) 
            {
                System.out.print(node.getValue() + " ");
                node = node.getRight();
            }
        }

}
