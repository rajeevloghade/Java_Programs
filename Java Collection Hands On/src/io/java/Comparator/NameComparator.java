package io.java.Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person personOne, Person personTwo) {
		return personOne.getName().compareTo(personTwo.getName());
	}

}
