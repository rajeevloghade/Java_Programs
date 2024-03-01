package com.Thread;

/**
 * Thread Constructor
 */

public class MyThreadThree extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}

}

class ThreadDemoThree {

	public static void main(String[] args) {

		MyThreadThree myThread = new MyThreadThree();
		Thread thread = new Thread(myThread);
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}
	}
}
