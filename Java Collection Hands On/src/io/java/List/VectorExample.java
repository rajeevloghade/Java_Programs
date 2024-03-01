package io.java.List;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("AAA");
		vector.add("BBB");
		vector.add("CCC");
		vector.add("DDD");
		System.out.println(vector);
		System.out.println("\nIterating using Enumeration : ");
		Enumeration<String> elements = vector.elements();
		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}
		System.out.println(vector);
		vector.removeAllElements();
		System.out.println(vector);
		
		Vector<String> vectorOne = new Vector<>(2);
		vectorOne.add("xyz");
		vectorOne.add("pqr");
		System.out.println(vectorOne);
		System.out.println(vectorOne.capacity());
		vectorOne.add("qwe");
		System.out.println(vectorOne.capacity());
		vectorOne.remove("qwe");
		System.out.println(vectorOne.capacity());
		System.out.println(vectorOne);
	}

}
