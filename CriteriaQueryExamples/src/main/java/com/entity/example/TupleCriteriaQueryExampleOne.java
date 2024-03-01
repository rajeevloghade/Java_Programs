package com.entity.example;

import java.util.List;

import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.entity.Employee;
import com.entity.insert.Utility;

public class TupleCriteriaQueryExampleOne {

	public static void main(String[] args) {
		getEmployeeInfo();
	}

	private static void getEmployeeInfo() {
		try (Session session = Utility.getSessionFactory().openSession()) {

			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
			CriteriaQuery<Tuple> criteriaQuery = criteriaBuilder.createQuery(Tuple.class);
			Root<Employee> root = criteriaQuery.from(Employee.class);

			// Selecting multiple attribute from employee
			Path<Object> name = root.get("name");
			Path<Object> email = root.get("email");
			Path<Object> salary = root.get("salary");

			criteriaQuery.multiselect(name, email, salary);

			List<Tuple> resultList = session.createQuery(criteriaQuery).getResultList();
			for (Tuple tuple : resultList) {
				System.out.println(tuple.get(name));
				System.out.println(tuple.get(email));
				System.out.println(tuple.get(salary));
				System.out.println("_____________");
			}

		} catch (HibernateException hibernateException) {
			hibernateException.printStackTrace();
		}
	}

}
