package com.entity;

import java.util.Date;

public class EmployeeDTO { // POJO(plain old java object) class/Entity class

	private int id;
	private String name;
	private int salary;
	private String email;
	private Date dateOfJoining;

	public EmployeeDTO() {
		super();
	}

	public EmployeeDTO(String name, String email, int salary) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public EmployeeDTO(String name, int salary, String email, Date dateOfJoining) {
		super();
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.dateOfJoining = dateOfJoining;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email
				+ ", dateOfJoining=" + dateOfJoining + "]";
	}

}
