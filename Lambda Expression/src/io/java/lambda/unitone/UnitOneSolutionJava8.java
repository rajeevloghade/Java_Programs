package io.java.lambda.unitone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class UnitOneSolutionJava8 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Rajeev", "Loghade", 22), new Person("Anand", "Kumar", 19),
				new Person("Ramesh", "Singh", 40), new Person("Yash", "Chandel", 25),
				new Person("Deepak", "Chouhan", 47));

		// step 1: Sort list by last name
		System.out.println("Printing all the persons listing\n");
		Collections.sort(persons, (p1, p2) -> p1.getSecName().compareTo(p2.getSecName()));

		// step 2: create a method that prints all elements in the list
		printConditionally(persons, p -> true);

		// step 3: create a method that prints all people that have last name beginning
		// with C
		System.out.println("\nPrinting all the persons last name starting with C\n");
		printConditionally(persons, p -> p.getSecName().startsWith("C"));

		System.out.println("\nPrinting all the persons first name starting with R\n");
		printConditionally(persons, p -> p.getFirstName().startsWith("R"));

	}

	private static void printConditionally(List<Person> persons, Predicate<Person> predicate) {
		for (Person person : persons) {
			if (predicate.test(person)) {
				System.out.println(person);
			}
		}
	}
}
