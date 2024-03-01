package io.java.Comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<Person> {

	@Override
	public int compare(Person personOne, Person personTwo) {
		return personOne.getId() - personTwo.getId();
	}

}
