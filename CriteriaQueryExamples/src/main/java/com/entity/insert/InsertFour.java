package com.entity.insert;

import java.util.Arrays;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.entity.Department;
import com.entity.Employee;

public class InsertFour {

	public static void main(String[] args) {

		try (Session sessionObject = Utility.getSessionFactory().openSession()) {
			sessionObject.getTransaction().begin();

			// creating department
			Department department = new Department();
			department.setName("IT");
			department.setLocation("London");

			// creating employee
			Employee employee = new Employee();
			employee.setName("KKK");
			employee.setSalary(12000);
			employee.setEmail("kkk@gmail.com");
			employee.setDateOfJoining(new Date());
			// setting department
			employee.setDepartment(department);

			Employee employeeTwo = new Employee();
			employeeTwo.setName("LLL");
			employeeTwo.setSalary(13000);
			employeeTwo.setEmail("lll@gmail.com");
			employeeTwo.setDateOfJoining(new Date());
			employeeTwo.setDepartment(department);

			Employee employeeThree = new Employee();
			employeeThree.setName("MMM");
			employeeThree.setSalary(14000);
			employeeThree.setEmail("mmm@gmail.com");
			employeeThree.setDateOfJoining(new Date());
			employeeThree.setDepartment(department);

			// setting employees into department
			department.setEmployees(Arrays.asList(employee, employeeTwo, employeeThree));

//			Department departmentTwo = new Department();
//			departmentTwo.setName("FINANCE");
//			departmentTwo.setLocation("New York");
//
//			Employee employeeFour = new Employee();
//			employeeFour.setName("OOO");
//			employeeFour.setSalary(15000);
//			employeeFour.setEmail("ooo@gmail.com");
//			employeeFour.setDateOfJoining(new Date());
//			employeeFour.setDepartment(departmentTwo);
//
//			Employee employeeFive = new Employee();
//			employeeFive.setName("NNN");
//			employeeFive.setSalary(16000);
//			employeeFive.setEmail("nnn@gmail.com");
//			employeeFive.setDateOfJoining(new Date());
//			employeeFive.setDepartment(departmentTwo);
//
//			department.setEmployees(Arrays.asList(employeeFour, employeeFive));

			sessionObject.save(department);
//			sessionObject.save(departmentTwo);

			sessionObject.getTransaction().commit();
			System.out.println("RECORD STORED");
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
