package com.ThreadMethods;

public class ThreadYield extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}
}

class ThreadYieldDemo {

	public static void main(String[] args) {
		ThreadYield thread = new ThreadYield();
		thread.start();
		ThreadYield thread2 = new ThreadYield();
		thread2.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}

	}
}

/**
 * yield() : It can stop the currently executing thread and will give a chance
 * to other waiting threads of the same priority
 */