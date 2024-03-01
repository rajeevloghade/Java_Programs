package com.entity.example;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.entity.Employee;
import com.entity.insert.Utility;

public class CriteriaQueryOrderByExample {

	public static void main(String[] args) {
		try (Session session = Utility.getSessionFactory().openSession()) {

			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);
			Root<Employee> rootEmployee = criteriaQuery.from(Employee.class);

			criteriaQuery.select(rootEmployee);
			// APPLYING ORDER BY
			criteriaQuery.orderBy(builder.asc(rootEmployee.get("salary")));

			Query<Employee> createQuery = session.createQuery(criteriaQuery);
			List<Employee> resultList = createQuery.getResultList();
			for (Employee employee : resultList) {
				System.err.println(employee.getName() + "\t" + employee.getSalary());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
