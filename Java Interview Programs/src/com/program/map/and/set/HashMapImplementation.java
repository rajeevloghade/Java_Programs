package com.program.map.and.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapImplementation<K, V> {

	private HashMap<K, V> hashMap;
	private int initialCapacity = 16;

	public HashMapImplementation() {
		this.hashMap = new HashMap<>(initialCapacity);
	}

	public HashMapImplementation(int initialCapacity) {
		this.hashMap = new HashMap<>(initialCapacity);
	}

	public V put(K key, V value) {
		return this.hashMap.put(key, value);
	}

	public void putAll(Map<K, V> map) {
		this.hashMap.putAll(map);
	}

	public V remove(Object key) {
		return this.hashMap.remove(key);
	}

	public int size() {
		return this.hashMap.size();
	}

	public void clear() {
		this.hashMap.clear();
	}

	public Collection<V> values() {
		return this.hashMap.values();
	}

	public Set<K> keySet() {
		return this.hashMap.keySet();
	}
}

class TestHashMap {

	public static void main(String[] args) {
		HashMapImplementation<Integer, String> hashMap = new HashMapImplementation<>();
		hashMap.put(1, "Kapil");
		hashMap.put(2, "Nikhil");
		hashMap.put(3, "Sachin");
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());

		Map<Integer, String> secondMap = new HashMap<Integer, String>();
		secondMap.put(4, "Aakash");
		secondMap.put(5, "Ravi");
		hashMap.putAll(secondMap);

		hashMap.remove(3);

		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());

		System.out.println("Size: " + hashMap.size());
		hashMap.clear();
		System.out.println("After clear Size: " + hashMap.size());

	}

}
