package com.stream.apis.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApisOnList {

	public static void main(String[] args) {

		// Find even number and return sum of them
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> evenNumber = numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
		int sum = numbers.stream().filter(number -> number % 2 == 0).mapToInt(Integer::intValue).sum();

		System.out.println("Even Number : " + evenNumber);
		System.out.println("Sum : " + sum);

		// Find even number from list of String
		List<String> list = Arrays.asList("3", "6", "8", "14", "15");

		System.out.println("String to int then even : ");
		list.stream().mapToInt(Integer::parseInt).filter(n -> n % 2 == 0).forEach(System.out::println);

		System.out.print("Square of every element : ");
		numbers.stream().map(i -> i * i).forEach(System.out::println);

		System.out.println("\nSorted : ");
		numbers.stream().sorted().forEach(System.out::println);

		// Find the minimum value in a list of integers
		System.out.print("\nMin : ");
		System.out.println(numbers.stream().min((x, y) -> x.compareTo(y)).get());

		// Find the maximum value in a list of integers
		System.out.print("\nMax : ");
		System.out.println(numbers.stream().max((x, y) -> x.compareTo(y)).get());

		// Find the Distinct value in a list of integers
		System.out.println("\nDistinct : ");
		numbers.stream().distinct().forEach(System.out::println);

		List<String> words = Arrays.asList("apple", "banana", "orange", "banana", "pear", "banana");

		// Count the number of occurrences of a particular string in a list of strings
		System.out.println("Number of occurrences : " + words.stream().filter(word -> word.equals("banana")).count());

		// Sort a list of String in alphabatical order
		System.out.println("Sort a list of String in alphabatical order : ");
		words.stream().sorted().forEach(System.out::println);

		// find first element greater than 5
		System.out.println(
				"First element greater than 5 : " + numbers.stream().filter(number -> number > 5).findFirst().get());

		// Group a list of strings by their length
		Map<Integer, List<String>> wordsByLength = words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(wordsByLength);

		// Find the second smallest element in a list of integers
		System.out
				.println("Second smallest element : " + numbers.stream().distinct().sorted().skip(1).findFirst().get());

		// Flat Map Use
		List<List<Integer>> nestedNumbers = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9));

		System.out.println("Before nestedNumbers : " + nestedNumbers);

		List<Integer> flattenedNumbers = nestedNumbers.stream().flatMap(Collection<Integer>::stream)
				.collect(Collectors.toList());

		System.out.println("After flattenedNumbers : " + flattenedNumbers);

	}

}
