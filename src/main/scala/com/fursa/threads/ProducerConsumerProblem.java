/**
 * 
 */
package com.fursa.threads;

import java.util.ArrayList;
import java.util.List;


/**
 * @author nkakkireni
 *
 */
public class ProducerConsumerProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Object lock = new Object();
		
		Thread producerThread = new Thread(new Producer(list, lock, 5));
		Thread producerThread2 = new Thread(new Producer(list, lock, 5));
		Thread consumThread = new Thread(new Consumer(list, lock));
		producerThread.start();
		producerThread2.start();
		consumThread.start();
	}

}
