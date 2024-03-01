package com.entity.example;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import com.entity.Employee;
import com.entity.insert.Utility;

public class CriteriaQueryExampleOne {

	public static void main(String[] args) {

		try (Session session = Utility.getSessionFactory().openSession()) {

			// Return an instance of CriteriaBuilder for the creation of CriteriaQuery
			// objects.
			CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();

			// Create a CriteriaQuery object with the specified resulttype.
			CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);

			// Create and add a query root corresponding to the given entity,forming a
			// cartesian product with any existing roots.
			Root<Employee> root = criteriaQuery.from(Employee.class);

			// Specify the item that is to be returned in the query result.
			criteriaQuery.select(root);

			// Applying condition(where clause)
			criteriaQuery.where(criteriaBuilder.equal(root.get("id"), 6));

			// criteriaQuery.where(criteriaBuilder.equal(root.get("name"), "GGG"));

			// finally creating query
			Query<Employee> createQuery = session.createQuery(criteriaQuery);

			// getting the result
			List<Employee> list = createQuery.list();
			list.forEach(System.out::println);

		} catch (HibernateException hibernateException) {
			hibernateException.printStackTrace();
		}
	}

}
