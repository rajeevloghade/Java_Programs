package com.program.map.and.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetImplementation<T> {

	private HashSet<T> hashSet;
	private int initialCapacity = 16;

	public HashSetImplementation() {
		this.hashSet = new HashSet<>(initialCapacity);
	}

	public HashSetImplementation(int initialCapacity) {
		this.hashSet = new HashSet<>(initialCapacity);
	}

	public boolean add(T value) {
		return this.hashSet.add(value);
	}

	public void addAll(Collection<T> value) {
		this.hashSet.addAll(value);
	}

	public boolean remove(T value) {
		return this.hashSet.remove(value);
	}

	public int size() {
		return this.hashSet.size();
	}

	public void clear() {
		this.hashSet.clear();
	}

	public Iterator<T> iterator() {
		return this.hashSet.iterator();
	}

}

class TestHashSet {

	public static void main(String[] args) {
		
		HashSetImplementation<String> hashSet = new HashSetImplementation<>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("B");
		hashSet.add("C");

		Iterator<String> iterator = hashSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
