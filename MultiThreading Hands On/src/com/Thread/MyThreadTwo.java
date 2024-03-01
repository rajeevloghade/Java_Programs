package com.Thread;

public class MyThreadTwo extends Thread {

	@Override
	public void run() {
		System.out.println("No arg Thread");
	}

	//it will act as normal method 
	public void run(int i) {
		System.out.println("Int arg Thread");
	}
	
//  it will act as normal method no thread will be created
//	public void start() {
//		System.out.println("Start Thread");
//	}
	
	public void start() {
		super.start();
		System.out.println("Start Thread");
	}
}

class ThreadDemoTwo {

	public static void main(String[] args) {
		MyThreadTwo myThread = new MyThreadTwo();// Thread Instantiation
		myThread.start();// Starting the thread
//		myThread.start();// Again starting the thread : IllegalThreadStateException
		System.out.println("Main Thread");
	}
}

/**
 * 1. start() will always call zero args run method other 
 * 2. overloaded run method we need to call explicitly
 * 3. If We don't override run method then start method will call Thread class 
 *    run method and that method has a empty implementation so we won't get any output
 *    
 */
