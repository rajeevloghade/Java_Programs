package com.stream.apis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterMap {

	public static void main(String[] args) {

		System.out.println("Filter : ");
		// Filter(Predicate) : Boolean valued
		String[] names = { "Anand", "Rajeev", "Shashank", "Amir", "Abhishek", "Neeraj" };

		Stream<String> stringStream = Stream.of(names);
		stringStream.filter(e -> e.startsWith("A")).forEach(System.out::println);

		System.out.println("\nMap : ");
		// Map(Function) : it works on element
		List<Integer> listOne = Arrays.asList(17, 12, 11, 14, 0, 13, -18, 20, 17, 15, -19, 20, 16, 13, 18); // Unmodifiable
																											// List
		listOne.stream().map(i -> i * i).forEach(System.out::println);

		System.out.println("\nSorted : ");
		listOne.stream().sorted().forEach(System.out::println);

		System.out.println("\nMin : ");
		System.out.println(listOne.stream().min((x, y) -> x.compareTo(y)).get());

		System.out.println("\nMax : ");
		System.out.println(listOne.stream().max((x, y) -> x.compareTo(y)).get());

		System.out.println("\nDistinct : ");
		listOne.stream().sorted().distinct().forEach(System.out::println);
	}

}
