package io.java.List;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("AAA");
		stack.add("BBB");
		System.out.println(stack);
		stack.push("CCC");
		System.out.println(stack);
		System.out.println("Pop : " + stack.pop());
		System.out.println(stack);
		System.out.println("Peek : " + stack.peek());
		System.out.println(stack);
		System.out.println("capacity : " + stack.capacity());
		System.out.println("elementAt : " + stack.elementAt(1));
		System.out.println("empty : " + stack.empty());
		System.out.println(stack);
		System.out.println(stack.indexOf("BBB"));
		System.out.println(stack.search("BBB"));
		System.out.println(stack);
		stack.removeIf(s -> s.startsWith("A"));
		System.out.println(stack);

	}

}
