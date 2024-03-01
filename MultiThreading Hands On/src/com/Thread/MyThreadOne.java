package com.Thread;

public class MyThreadOne extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}

class ThreadDemo {

	public static void main(String[] args) {
		MyThreadOne myThread = new MyThreadOne();// Thread Instantiation
		myThread.start();// Starting the thread
//		myThread.run();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}
}

/**
 * start() Register the thread with thread scheduler Perform all other mandatory
 * activities Invoke run() method
 */
