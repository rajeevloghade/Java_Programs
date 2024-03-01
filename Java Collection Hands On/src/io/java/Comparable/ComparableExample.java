package io.java.Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {

		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person(3, "C", "300"));
		persons.add(new Person(2, "B", "200"));
		persons.add(new Person(5, "E", "500"));
		persons.add(new Person(4, "D", "400"));
		persons.add(new Person(1, "A", "100"));
		System.out.println(persons);
		// Comparable
		Collections.sort(persons);
		System.out.println(persons);
	}

}
/**
 * Comparable : 
 * 1. It has a default natural sorting order
 * 2. It modifies the actual class
 * 3. It is present in java.lang pkg
 * 4. It contains compareTo method
 * 5. All wrapper classes and String implements Comparable interface
 */