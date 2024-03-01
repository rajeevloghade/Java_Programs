package io.java.lambda.unitthree;

public class MethodReferenceExampleOne {

	public static void main(String[] args) {
//		Thread thread = new Thread(() -> printMessage());
		Thread thread = new Thread(MethodReferenceExampleOne::printMessage);
		thread.start();
	}

	public static void printMessage() {
		System.out.println("Hello from printMessage...");
	}
}


//MethodReferenceExampleOne::printMessage === () -> printMessage()