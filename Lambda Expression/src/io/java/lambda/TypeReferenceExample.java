package io.java.lambda;

public class TypeReferenceExample {

	public static void main(String[] args) {
//		StringLengthLambda myLambda1 = (String s) -> s.length();
//		System.out.println(myLambda1.getLength("Hello Lambda"));
		// we don't really need to define type String here
//		StringLengthLambda myLambda = (s) -> s.length();

		StringLengthLambda myLambda = s -> s.length();
		System.out.println(myLambda.getLength("Rajeev Loghade"));

		printLambda(s -> s.length());
	}

	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello from Lambda"));
	}

	interface StringLengthLambda {
		int getLength(String s);
	}

}
