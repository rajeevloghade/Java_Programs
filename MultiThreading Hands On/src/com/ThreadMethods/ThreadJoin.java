package com.ThreadMethods;

public class ThreadJoin extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Child Thread");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadDemoTwo {

	public static void main(String[] args) throws InterruptedException {
		ThreadJoin thread = new ThreadJoin();
		thread.start();
		thread.join();
//		thread.join(3000); //milisec time 
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}

	}
}

/**
 * If any thread wants to wait until other thread to complete the we should go
 * for join() method.
 */