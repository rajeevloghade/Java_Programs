package io.java.lambda.unitthree;

import java.util.Arrays;
import java.util.List;

import io.java.lambda.unitone.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Rajeev", "Loghade", 22), new Person("Anand", "Kumar", 19),
				new Person("Ramesh", "Singh", 40), new Person("Yash", "Chandel", 25),
				new Person("Deepak", "Patel", 47));

		System.out.println("Using for loop");
		for (int i = 0; i < persons.size(); i++) {
			System.out.println(persons.get(i));
		}

		System.out.println("\nUsing for each loop");
		for (Person person : persons) {
			System.out.println(person);
		}
		// this is sequential

		System.out.println("\nUsing lambda for each loop");
//		persons.forEach(p -> System.out.println(p)); converting it into method reference
		persons.forEach(System.out::println);
	}
}

//In java 8, new way of iterating is called internal iterators. we are giving the control to somebody else

//persons.forEach(System.out::println); this is allows controller to run multiple threads simultaneously

