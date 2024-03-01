package io.java.lambda.unitone;

public class RunnableExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Printed inside runnable");
			}
		});

		thread.run();

		Thread myThread = new Thread(() -> System.out.println("Printed inside lambda"));
		myThread.run();
	}

}

//Remember Runnable interface has a single method.If it had more than one method, 
//we could not have written a lambda function of that type.