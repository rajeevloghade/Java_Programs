package com.stream.apis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjects {

	public static void main(String[] args) {

		// 1. Blank Stream
		Stream<Object> emptyStream = Stream.empty(); // empty
		System.out.println("Blank Stream : ");
		emptyStream.forEach(e -> System.out.println(e));

		// 2. Array, Object, Collection
		String[] names = { "A", "B", "C", "D" };
		Stream<String> stringStream = Stream.of(names);
		System.out.println("Array, Object, Collection : ");
		stringStream.forEach(e -> System.out.println(e));

		// 3.Builder method
		Stream<Object> buildStream = Stream.builder().build(); // empty
		System.out.println("Builder method :");
		buildStream.forEach(e -> System.out.println(e));

		// 4.
		IntStream streamInt = Arrays.stream(new int[] { 2, 4, 6, 8, 10 });
		System.out.println("");
		streamInt.forEach(e -> System.out.println(e));

		// 5. List, Set
		List<Integer> listOne = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20); // Unmodifiable List
		System.out.println("");
		listOne.forEach(e -> System.out.println(e));
		listOne.forEach(System.out::println);
	}

}
