package com.Runnable;

/**
 * By implementing Runnable interface and it is also recommanded
 */
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}

}

class RunnableDemo {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
//		myRunnable.start(); //compile time error
//		myRunnable.run(); // it will act as normal method

		Thread threadOne = new Thread();
		threadOne.start(); // It has empty implementation
//		threadOne.run(); // it will act as normal method

		Thread thread = new Thread(myRunnable);// Target Runnabale
		thread.start();// Starting the thread
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}
}
