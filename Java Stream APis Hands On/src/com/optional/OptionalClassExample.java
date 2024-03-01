package com.optional;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {

		String str = "This is Optional class example";
//		String str = null;

		// without Optional Class
		if (str != null) {
			System.out.println("Length : " + str.length());
		} else {
			System.out.println("Null Value");
		}

		// with Optional Class
		Optional<String> ofNullable = Optional.ofNullable(str);
		System.out.println("isPresent : " + ofNullable.isPresent());
		System.out.println("isEmpty : " + ofNullable.isEmpty());
		System.out.println("Optional Get : " + ofNullable.get()); // if not present then NoSuchElementException
		System.out.println("Optional Get : " + ofNullable.get());
		System.out.println(ofNullable.orElse("Value not present"));

		// Optional method
		Optional<String> optionalMethod = getName();
		System.out.println(optionalMethod.orElse("No value"));

	}

	public static Optional<String> getName() {
		String str = "Rajeev";
		return Optional.ofNullable(str);
	}

}
