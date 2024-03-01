package com.Thread;

public class MyThreadFour extends Thread {
	public void run() {
		System.out.println("This line is executed by 2 " + Thread.currentThread().getName());
	}
}

class ThreadDemoFour {

	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getName());
		MyThreadFour myThreadFour = new MyThreadFour();
		myThreadFour.start();
		System.out.println("This line is executed by 1 " + Thread.currentThread().getName());
//		Thread.currentThread().setName("Rajeev");
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(10 / 0);
	}
}
