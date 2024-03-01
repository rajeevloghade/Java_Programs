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
import com.entity.insert.Utility;

public class CriteriaQueryExampleThree {

	public static void main(String[] args) {

		try (Session session = Utility.getSessionFactory().openSession()) {

			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

			CriteriaQuery<Object[]> criteriaQuery = criteriaBuilder.createQuery(Object[].class);

			Root<Employee> root = criteriaQuery.from(Employee.class);

			Path<Object> name = root.get("name");
			Path<Object> email = root.get("email");
			Path<Object> salary = root.get("salary");
			// Selecting multiple attribute from employee - I WAY
			// criteriaQuery.select(criteriaBuilder.array(name, email, salary));

			// Selecting multiple attribute from employee - II WAY
			criteriaQuery.multiselect(root.get("name"), root.get("email"), root.get("salary"));

			// finally creating query
			Query<Object[]> createQuery = session.createQuery(criteriaQuery);

			// getting the result
			List<Object[]> list = createQuery.list();
			for (Object[] objects : list) {
				System.out.println(objects[0]);
				System.out.println(objects[1]);
				System.out.println(objects[2]);
				System.out.println("___________");
			}
		} catch (HibernateException hibernateException) {
			hibernateException.printStackTrace();
		}
	}

}
