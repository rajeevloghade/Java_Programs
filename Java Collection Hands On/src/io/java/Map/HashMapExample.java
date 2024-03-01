package io.java.Map;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		hashMap.put(1, "AAA");
		hashMap.put(2, "BBB");
		hashMap.put(3, "CCC");
		hashMap.put(4, "DDD");
		System.out.println(hashMap);
		HashMap<Integer, String> hashMapOne = new HashMap<>();
		hashMap.put(5, "EEE");
		hashMap.put(6, "FFF");
		hashMap.putAll(hashMapOne);
		System.out.println(hashMap);
		System.out.println(hashMap.get(2));
		System.out.println("\nIterating using entrySet method : ");
		for (Entry<Integer, String> map : hashMap.entrySet()) {
			System.out.println(map.getKey() + "=" + map.getValue());
		}
		System.out.println(hashMap.getOrDefault(7, "default"));
		hashMap.forEach((k, v) -> System.out.println(k + "-" + v));

		System.out.println("Keys : " + hashMap.keySet());
		System.out.println("Values : " + hashMap.values());
	}

}
/**
 * Map (Interface)-> (Classes) HashMap, HashTable, (Interface)SortedMap,
 * (Class)TreeMap
 * 
 * Map stores the elements in the form of keys-values pairs which is designed
 * for faster lookups. Here every key is unique and maps to a single value.
 */