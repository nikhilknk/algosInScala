package com.fursa.threads;

public class PrintNumbers extends Thread {

	 Object lock;

	PrintNumbers(Object lock) {
		 this.lock = lock;
	}

	public static void main(String ar[]) {
		Object obj = new Object();
		// This constructor is required for the identification of wait/notify
		// communication
		PrintNumbers odd = new PrintNumbers(obj);
		PrintNumbers even = new PrintNumbers(obj);
		odd.setName("Odd");
		even.setName("Even");
		even.start();
		odd.start();

	}

	@Override
	public void run() {
		for(int i=0;i<=100;i++) {

			synchronized (lock) {

				if (Thread.currentThread().getName().equals("Even")) {

					if(i % 2 == 0 ){
						System.out.println(Thread.currentThread().getName() + " - "+ i);
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}					
					else if (i % 2 != 0 ) {
						lock.notify();
					}
				}
				
				if (Thread.currentThread().getName().equals("Odd")) {

					if(i % 2 == 1 ){
						System.out.println(Thread.currentThread().getName() + " - "+ i);
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}					
					else if (i % 2 != 1 ) {
						lock.notify();
					}
				}
				

			}
		}
	}
}