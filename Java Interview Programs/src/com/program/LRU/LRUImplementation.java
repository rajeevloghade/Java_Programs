package com.program.LRU;

import java.util.HashMap;

public class LRUImplementation {

	Node head = new Node(0, 0);
	Node tail = new Node(0, 0);

	int capacity;
	HashMap<Integer, Node> map = new HashMap<>();

	public LRUImplementation(int capacity) {
		this.capacity = capacity;
		head.next = tail;
		tail.prev = head;
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			Node node = map.get(key);
			remove(node);
			insert(node);
			return node.value;
		}
		return -1;
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			remove(map.get(key));
		}
		if (map.size() == capacity) {
			remove(tail.prev);
		}
		insert(new Node(key, value));
	}

	public void remove(Node node) {
		map.remove(node.key);
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}

	public void insert(Node node) {
		map.put(node.key, node);
		node.next = head.next;
		head.next.prev = node;
		head.next = node;
		node.prev = head;

	}

	class Node {
		Node next, prev;
		int key;
		int value;

		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}

	}

	public static void main(String[] args) {
		LRUImplementation lRUCache = new LRUImplementation(2);
		lRUCache.put(1, 1); // cache is {1=1}
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		System.out.println(lRUCache.get(1));// return 1
		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		System.out.println(lRUCache.get(2)); // returns -1 (not found)
		lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		System.out.println(lRUCache.get(1));// return -1 (not found)
		System.out.println(lRUCache.get(3)); // return 3
		System.out.println(lRUCache.get(4));// return 4
	}

}
