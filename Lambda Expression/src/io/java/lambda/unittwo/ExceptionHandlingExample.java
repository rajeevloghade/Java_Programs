package io.java.lambda.unittwo;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int someNumbers[] = { 1, 2, 3, 4, 5 };
		int key = 0;

//		process(someNumbers, key, (v, k) -> System.out.println(v / k));
		process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biConsumer) {
		for (int i : someNumbers) {
			biConsumer.accept(i, key);
		}
	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biConsumer) {
		return (v, k) -> {
			try {
				biConsumer.accept(v, k);
			} catch (ArithmeticException arithmeticException) {
				System.out.println("Exception caught in wrapper lambda");
			}
		};
	}
}
