/**
 * 
 */
package com.fursa.linkedList;

import java.util.LinkedList;

/**
 * @author nkakkireni
 *
 */
public class reverseAlternateKNodes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<Integer> Modifiedlist = new LinkedList<Integer>();
		 
        // Creating the linkedlist
        for (int i = 20; i > 0; i--) {
            list.push(i);
        }
        int k =3;
        System.out.println("Given Linked List :"+list.toString());
       // reverseKNodes(list,k);
        System.out.println("Modified Linked List :");
	}

	/*private static void reverseKNodes(LinkedList<Integer> list, int k,LinkedList<Integer> Modifiedlist) {
			if(k==0)
				return;
			else
				int removedElement = list.remove(k);
				reverseKNodes(list, k);
	}*/

}
