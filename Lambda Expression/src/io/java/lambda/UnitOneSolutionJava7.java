package io.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitOneSolutionJava7 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Rajeev", "Loghade", 22), new Person("Anand", "Kumar", 19),
				new Person("Ramesh", "Singh", 40), new Person("Yash", "Chandel", 25),
				new Person("Deepak", "Chouhan", 47));

		// step 1: Sort list by last name
		System.out.println("Printing all the persons listing\n");
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getSecName().compareTo(arg1.getSecName());
			}
		});

		// step 2: create a method that prints all elements in the list
		printAll(persons);

		// step 3: create a method that prints all people that have last name beginning
		// with C
		System.out.println("\nPrinting all the persons last name starting with C\n");
		printConditionally(persons, new Condition() {
			@Override
			public boolean test(Person person) {
				return person.getSecName().startsWith("C");
			}
		});

		System.out.println("\nPrinting all the persons first name starting with R\n");
		printConditionally(persons, new Condition() {
			@Override
			public boolean test(Person person) {
				return person.getFirstName().startsWith("R");
			}
		});

	}

	private static void printConditionally(List<Person> persons, Condition condition) {
		for (Person person : persons) {
			if (condition.test(person)) {
				System.out.println(person);
			}
		}
	}

	private static void printAll(List<Person> persons) {
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}

interface Condition {
	boolean test(Person person);
}