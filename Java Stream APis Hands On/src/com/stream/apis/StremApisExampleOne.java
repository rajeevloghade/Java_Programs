package com.stream.apis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StremApisExampleOne {

	public static void main(String[] args) {

		// Create a collection and filter it

		List<Integer> listOne = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); // Unmodifiable List
		System.out.println("listOne : " + listOne);

		List<Integer> listTwo = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20); // Unmodifiable List
		System.out.println("listTwo : " + listTwo);

		List<Integer> arrayList = new ArrayList<>(); // Modifiable List
		arrayList.add(21);
		arrayList.add(22);
		arrayList.add(23);
		arrayList.add(24);
		arrayList.add(25);
		System.out.println("arrayList : " + arrayList);

		// Without Stream APis
		System.out.println("Without Stream APis : ");
		ArrayList<Integer> evenListOne = new ArrayList<>();

		for (Integer number : listOne)
			if (number % 2 == 0)
				evenListOne.add(number);

		System.out.println("evenListOne : " + evenListOne);

		// With Stream APis
		System.out.println("With Stream APis : ");
//		Stream<Integer> stream = listOne.stream();
//		List<Integer> evenListTwo = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//		System.out.println("evenListTwo : " + evenListTwo);

		listOne.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("OddListOne : " + listOne.stream().filter(i -> i % 2 != 0).collect(Collectors.toList()));

		System.out.println("number > 15 : ");
		listTwo.stream().filter(number -> number > 15).collect(Collectors.toList()).forEach(System.out::println);

	}
}
