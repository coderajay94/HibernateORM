package com.ajay.springbootjpademo.service;

public class PrintNumbers {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new PrintSeq());
		Thread thread2 = new Thread(new PrintSeq());
		Thread thread3 = new Thread(new PrintSeq());
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}


class PrintSeq implements Runnable{

	static int num=1;
	
	static Object lock = new Object();
	
	@Override
	public void run() {
	
		synchronized (lock) {
			while(num<100) {
				
				try {
					lock.wait();
					System.out.println(num);
					num++;
					lock.notifyAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
		
	}
	
	
}