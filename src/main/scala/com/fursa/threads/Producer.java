/**
 * 
 */
package com.fursa.threads;

import java.util.List;

/**
 * @author nkakkireni
 *
 */
public class Producer implements Runnable {

	List<Integer> list;
	Object lock;
	int max;

	public Producer(List<Integer> list, Object lock,int max) {
		super();
		this.list = list;
		this.lock = lock;
		this.max = max;
	}

	public void run() {
		for(int i =0;i<=7;i++){
			synchronized (lock) {

				while(list.size() == max){

					try {
						System.out.println("Queue is full " + Thread.currentThread().getName()
								+ " is waiting , size: " + list.size());
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("produced by "+Thread.currentThread().getName()+"::"+i);
				list.add(i);
				lock.notifyAll();
			}
			System.out.println("");

		}
	}

}
