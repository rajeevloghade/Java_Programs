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

public class CriteriaQueryJoinExample {

	public static void main(String[] args) {
		try (Session session = Utility.getSessionFactory().openSession()) {

			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Object[]> criteriaQuery = builder.createQuery(Object[].class);
			Root<Employee> rootEmployee = criteriaQuery.from(Employee.class);
			Root<Department> rootDepartment = criteriaQuery.from(Department.class);

			criteriaQuery.multiselect(rootEmployee, rootDepartment);
			criteriaQuery.where(builder.equal(rootEmployee.get("department"), rootDepartment.get("id")));

			Query<Object[]> createQuery = session.createQuery(criteriaQuery);
			List<Object[]> resultList = createQuery.getResultList();
			for (Object[] objects : resultList) {
				Employee employee = (Employee) objects[0];
				System.err.println(employee.getName() + "\t" + employee.getSalary());
				Department department = (Department) objects[1];
				System.err.println(department.getName() + "\t" + department.getLocation());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
