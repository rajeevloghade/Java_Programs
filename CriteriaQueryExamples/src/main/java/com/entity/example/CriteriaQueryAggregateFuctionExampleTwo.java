package com.entity.example;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.entity.Employee;
import com.entity.EmployeeStatisticsInfo;
import com.entity.insert.Utility;

public class CriteriaQueryAggregateFuctionExampleTwo {

	public static void main(String[] args) {
		try (Session session = Utility.getSessionFactory().openSession()) {

			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<EmployeeStatisticsInfo> criteriaQuery = builder.createQuery(EmployeeStatisticsInfo.class);

			Root<Employee> root = criteriaQuery.from(Employee.class);

			Expression<Long> totalNoOfEmployees = builder.count(root);
			Expression<Long> totalNoOfDistictEmployees = builder.countDistinct(root);
			Expression<Double> averageSalaryOfEmployees = builder.avg(root.get("salary"));
			Expression<Long> sumOfSalaryOfEmployees = builder.sum(root.get("salary"));
			Expression<Integer> maxSalaryOfEmployees = builder.max(root.get("salary"));

			criteriaQuery.select(builder.construct(EmployeeStatisticsInfo.class, totalNoOfEmployees,
					totalNoOfDistictEmployees, averageSalaryOfEmployees, sumOfSalaryOfEmployees, maxSalaryOfEmployees));

			Query<EmployeeStatisticsInfo> createQuery = session.createQuery(criteriaQuery);
			System.err.println("Employee Statistics Info : " + createQuery.getResultList());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
