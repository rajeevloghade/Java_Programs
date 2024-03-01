package io.java.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {

	public static void main(String[] args) {

		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person(3, "A", "300"));
		persons.add(new Person(2, "C", "200"));
		persons.add(new Person(5, "B", "500"));
		persons.add(new Person(4, "E", "400"));
		persons.add(new Person(1, "D", "100"));
		System.out.println(persons);
		// Comparator (by Id)
		Collections.sort(persons, new IdComparator());
//		Collections.sort(persons, (one, two) -> one.getId() - two.getId());
		System.out.println(persons);
		// Comparator (by Name)
		Collections.sort(persons, new NameComparator());
		System.out.println(persons);
	}

}
/**
 * Comparator : 
 * 1. Comparator has customize sorting order
 * 2. It doesn't modifies the actual class
 * 3. It is present in java.util pkg
 * 4. It contains compare and equals methods
 * 5. Only two classes implements it, which is Collator and RuleBasedCollator
 */