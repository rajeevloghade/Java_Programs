package io.java.lambda.unittwo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.java.lambda.Person;

public class StandardFunctionalInterfaceExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Rajeev", "Loghade", 22), new Person("Anand", "Kumar", 19),
				new Person("Ramesh", "Singh", 40), new Person("Yash", "Chandel", 25),
				new Person("Deepak", "Chouhan", 47));

		// step 1: Sort list by last name
		System.out.println("Printing all the persons listing\n");
		Collections.sort(persons, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

		// step 2: create a method that prints all elements in the list
		performConditionally(persons, p -> true, p -> System.out.println(p));

		// step 3: create a method that prints all people that have last name beginning
		// with C
		System.out.println("\nPrinting all the persons last name starting with C\n");
		performConditionally(persons, p -> p.getSecName().startsWith("C"), p -> System.out.println(p));

		System.out.println("\nPrinting all the persons first name starting with R\n");
		performConditionally(persons, p -> p.getFirstName().startsWith("R"), p -> System.out.println(p));

	}

	private static void performConditionally(List<Person> persons, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person person : persons) {
			if (predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}
}
