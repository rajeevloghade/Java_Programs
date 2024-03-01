package com.ThreadMethods;

public class ThreadJoinTwo extends Thread {
	static Thread mt;

	public void run() {
		try {
			System.out.println("ThreadJoinTwo is waiting for : " + mt.getName());
			mt.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");
		}
	}
}

class ThreadDemoThree {

	public static void main(String[] args) throws InterruptedException {
		ThreadJoinTwo.mt = Thread.currentThread();
		ThreadJoinTwo thread = new ThreadJoinTwo();
		thread.start();
		System.out.println("main is waiting for : " + thread.getName());
		thread.join(); // DEADLOCK SITUATION
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}

	}
}

class ThreadDemoFour {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("ThreadDemoFour... 1");
//		Thread.currentThread().join(); //DEADLOCK SITUATION
		System.out.println("ThreadDemoFour... 2");
	}
}

/**
 * If any thread wants to wait until other thread to complete the we should go
 * for join() method.
 */