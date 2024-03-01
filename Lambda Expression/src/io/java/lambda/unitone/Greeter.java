package io.java.lambda.unitone;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		Greeting greeeting = new HelloWorldGreeeting();
		greeeting.perform();// Hello World from Interface...!!!

		// actually we are implementing perform() method of Greeting interface
		Greeting myLambda = () -> System.out.println("Hello World from Lambda Function...!!!");
		myLambda.perform();// Hello World from Lambda Function...!!!

		// anonymous class
		Greeting anonymousClass = new Greeting() {
			public void perform() {
				System.out.println("Hello World from anonymous Class...!!!");
			}
		};
		anonymousClass.perform();// Hello World from anonymous Class...!!!

	}
}
