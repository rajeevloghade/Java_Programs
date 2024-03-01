package com.entity.example;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.entity.Department;
import com.entity.Employee;
import com.entity.insert.Utility;

public class CriteriaQueryGroupByAndHavingExample {

	public static void main(String[] args) {
		try (Session session = Utility.getSessionFactory().openSession()) {

			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
			Root<Employee> rootEmployee = criteriaQuery.from(Employee.class);

			criteriaQuery.multiselect(builder.count(rootEmployee.get("name")), builder.sum(rootEmployee.get("salary")),
					rootEmployee.get("department"));

			// APPLYING GROUP BY AND HAVING
			criteriaQuery.groupBy(rootEmployee.get("department"));
			criteriaQuery.having(builder.greaterThan(builder.sum(rootEmployee.get("salary")), 20000));

			Query<Object[]> createQuery = session.createQuery(criteriaQuery);
			List<Object[]> resultList = createQuery.getResultList();
			for (Object[] objects : resultList) {
				Long count = (Long) objects[0];
				System.err.println("Count : " + count);
				Long salary = (Long) objects[1];
				System.err.println("Salary : " + salary);
				Department department = (Department) objects[2];
				System.err.println(department.getId() + "\t" + department.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
