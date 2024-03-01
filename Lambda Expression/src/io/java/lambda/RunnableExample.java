package io.java.lambda;

public class RunnableExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Printed inside runnable");
			}
		});

		thread.start();
		
		Thread myThread = new Thread(()-> System.out.println("Printed inside lambda"));
		myThread.start();
	}

}

//Remember Runnable interface has a single method.If it had more than one method, 
//we could not have written a lambda function of that type.