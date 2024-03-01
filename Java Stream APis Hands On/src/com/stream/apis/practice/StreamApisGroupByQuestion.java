package com.stream.apis.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApisGroupByQuestion {

	public static void main(String[] args) {
		// create a list of employees
		List<Emp> empList = Arrays.asList(new Emp(1, "John", 1), new Emp(2, "Jane", 1), new Emp(3, "Bob", 2),
				new Emp(4, "Alice", 2), new Emp(5, "Dave", 2), new Emp(6, "Mary", 3));

		// create a list of departments
		List<Dep> depList = Arrays.asList(new Dep(1, "Sales"), new Dep(2, "Marketing"), new Dep(3, "IT"));

		// print out the result
		Map<Dep, List<Emp>> deptWithEmp = empList.stream().collect(Collectors.groupingBy(
				emp -> depList.stream().filter(dep -> dep.getDepId() == emp.getDepId()).findFirst().orElse(null)));

		deptWithEmp.forEach((dept, employees) -> System.out.println(dept.getDepName() + " : " + employees.size()));
	}
}

class Emp {
	private int empId;
	private String empName;
	private int depId;

	public Emp(int empId, String empName, int depId) {
		this.empId = empId;
		this.empName = empName;
		this.depId = depId;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public int getDepId() {
		return depId;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", depId=" + depId + "]";
	}

}

class Dep {
	private int depId;
	private String depName;

	public Dep(int depId, String depName) {
		this.depId = depId;
		this.depName = depName;
	}

	public int getDepId() {
		return depId;
	}

	public String getDepName() {
		return depName;
	}

	@Override
	public String toString() {
		return "Dep [depId=" + depId + ", depName=" + depName + "]";
	}

}