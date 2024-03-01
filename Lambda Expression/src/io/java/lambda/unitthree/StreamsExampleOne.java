package io.java.lambda.unitthree;

import java.util.Arrays;
import java.util.List;

import io.java.lambda.unitone.Person;

public class StreamsExampleOne {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Rajeev", "Loghade", 22), new Person("Anand", "Kumar", 19),
				new Person("Ramesh", "Singh", 40), new Person("Yash", "Chandel", 25),
				new Person("Deepak", "Patel", 47));

		persons.stream().filter(p -> p.getFirstName().startsWith("R"))
				.forEach(p -> System.out.println(p.getFirstName()));
		
		long count = persons.stream().filter(p -> p.getSecName().startsWith("C")).count();
		System.out.println(count);
		
		long count2 = persons.parallelStream().filter(p -> p.getFirstName().startsWith("D")).count();
		System.out.println(count2);
		
	}
}

//In java 8, every collection comes with streams methods