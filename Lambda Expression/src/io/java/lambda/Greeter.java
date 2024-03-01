package io.java.lambda;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {

		Greeter greeter=new Greeter();
		HelloWorldGreeeting helloWorldGreeeting=new HelloWorldGreeeting();
		greeter.greet(helloWorldGreeeting);// Greeter's perform method (Hello World from Interface...!!!)
		
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


/**
 * greetingFunction = () ->  System.out.println("Hello World from Interface...!!!");
 * 
 * doubleNumberFunction = (int a) -> a * 2;
 * 
 * addFunction = (int a, int b) -> a + b;
 * 
 * safeDivideFunction = (int a, int b) -> {
 * 						 	if(b==0) return 0;
 * 						 	return a/b;	
 * 						};
 * 
 * strinLengthFunction = (String s) -> s.length();
 */
