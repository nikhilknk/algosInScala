/**
 * 
 */
package com.fursa.threads;

import java.util.List;

/**
 * @author nkakkireni
 *
 */
public class Consumer implements Runnable {

	List<Integer> list;
	Object lock;

	public Consumer(List<Integer> list,Object lock) {
		super();
		this.list = list;
		this.lock = lock;
	}

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		while(true){
			synchronized (lock) {
				 try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				while(list.size()<=0){
					try {
						System.out.println("Queue is empty " + Thread.currentThread().getName()
								+ " is waiting , size: " + list.size());
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("consumed by thread "+Thread.currentThread().getName()+"::"+list.remove(0));
				lock.notifyAll();
			}
			
		}
	
	}
}
