package io.java.lambda.unitthree;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.java.lambda.Person;

public class MethodReferenceExampleTwo {


	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Rajeev", "Loghade", 22), new Person("Anand", "Kumar", 19),
				new Person("Ramesh", "Singh", 40), new Person("Yash", "Chandel", 25),
				new Person("Deepak", "Chouhan", 47));

		// create a method that prints all elements in the list
		performConditionally(persons, p -> true, System.out::println);

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
