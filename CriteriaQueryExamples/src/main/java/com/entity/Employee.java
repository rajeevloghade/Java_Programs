package com.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee { // POJO(plain old java object) class/Entity class

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeid_pk")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "salary")
	private int salary;

	@Column(name = "email")
	private String email;

	@Column(name = "designation")
	private String designation;

	@Column(name = "dateofjoining")
	private Date dateOfJoining;

	@ManyToOne
	@JoinColumn(name = "departmentid_fk")
	private Department department;

	public Employee() {
		super();
	}

	public Employee(String name, int salary, String email, Date dateOfJoining) {
		super();
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.dateOfJoining = dateOfJoining;
	}

	public Employee(String name, int salary, String email, String designation, Date dateOfJoining,
			Department department) {
		super();
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
		this.department = department;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
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
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + ", designation="
				+ designation + ", dateOfJoining=" + dateOfJoining + "]";
	}

}
