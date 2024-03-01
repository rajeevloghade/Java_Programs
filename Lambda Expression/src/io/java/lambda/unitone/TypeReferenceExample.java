package io.java.lambda.unitone;

public class TypeReferenceExample {

	public static void main(String[] args) {
//		StringLengthLambda myLambda = (String s) -> s.length();
//		StringLengthLambda myLambda = (s) -> s.length();

		StringLengthLambda myLambda = s -> s.length();
		System.out.println(myLambda.getLength("Rajeev Loghade"));
		
		printLambda(s->s.length());
	}

	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello from Lambda"));
	}

	interface StringLengthLambda {
		int getLength(String s);
	}

}
