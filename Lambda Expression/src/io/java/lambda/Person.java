package io.java.lambda;

public class Person {

	private String firstName;
	private String secName;
	private int age;

	public Person(String firstName, String secName, int age) {
		super();
		this.firstName = firstName;
		this.secName = secName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecName() {
		return secName;
	}

	public void setSecName(String secName) {
		this.secName = secName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", secName=" + secName + ", age=" + age + "]";
	}

}
