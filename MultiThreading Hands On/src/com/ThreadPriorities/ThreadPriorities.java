package com.ThreadPriorities;

/**
 * ThreadPriorities (1 - Min and 10 - Max) Thread.MIN_PRIORITY - 1
 * Thread.NORM_PRIORITY - 5 Thread.MAX_PRIORITY - 10
 */
public class ThreadPriorities extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}

class ThreadDemoOne {
	public static void main(String[] args) {
		System.out.println("Main : " + Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(15); //IllegalArgumentException
//		Thread.currentThread().setPriority(7); //working 
		ThreadPriorities threadPriorities = new ThreadPriorities();
		threadPriorities.setPriority(10);
		System.out.println("Child : " + threadPriorities.getPriority());
		threadPriorities.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}
}
/**
 * Default priority of main thread is 5
 */