package com.entity.example;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.entity.Employee;
import com.entity.EmployeeDTO;
import com.entity.insert.Utility;

public class CriteriaQueryExampleFour {

	public static void main(String[] args) {
		List<EmployeeDTO> employeeInfo = getEmployeeInfo();
		employeeInfo.forEach(System.out::println);
	}

	private static List<EmployeeDTO> getEmployeeInfo() {
		List<EmployeeDTO> resultList = null;
		try (Session session = Utility.getSessionFactory().openSession()) {

			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<EmployeeDTO> criteriaQuery = criteriaBuilder.createQuery(EmployeeDTO.class);
			Root<Employee> root = criteriaQuery.from(Employee.class);

			// Selecting multiple attribute from employee
			Path<Object> name = root.get("name");
			Path<Object> email = root.get("email");
			Path<Object> salary = root.get("salary");

			criteriaQuery.select(criteriaBuilder.construct(EmployeeDTO.class, name, email, salary));

			Query<EmployeeDTO> createQuery = session.createQuery(criteriaQuery);

			// getting the result
			// List<EmployeeDTO> list = createQuery.list();
			resultList = createQuery.getResultList();
		} catch (HibernateException hibernateException) {
			hibernateException.printStackTrace();
		}
		return resultList;
	}

}
