package com.entity.example;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.entity.Employee;
import com.entity.insert.Utility;

public class CriteriaQueryAggregateFuctionExample {

	public static void main(String[] args) {
		getTotalNoOfEmployees();
		getTotalNoOfDistinctEmployees();
		getMaxSalaryOfEmployees();
		getAverageSalaryOfEmployees();
		getSumOfSalaryOfEmployees();
	}

	private static void getSumOfSalaryOfEmployees() {
		try (Session session = Utility.getSessionFactory().openSession()) {

			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Double> criteriaQuery = builder.createQuery(Double.class);

			Root<Employee> root = criteriaQuery.from(Employee.class);

			criteriaQuery.select(builder.sum(root.get("salary")));

			Query<Double> createQuery = session.createQuery(criteriaQuery);
			System.err.println("SUM SALARY OF EMPLOYEES : " + createQuery.getSingleResult());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void getAverageSalaryOfEmployees() {
		try (Session session = Utility.getSessionFactory().openSession()) {

			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Double> criteriaQuery = builder.createQuery(Double.class);

			Root<Employee> root = criteriaQuery.from(Employee.class);

			criteriaQuery.select(builder.avg(root.get("salary")));

			Query<Double> createQuery = session.createQuery(criteriaQuery);
			System.err.println("AVERAGE SALARY OF EMPLOYEES : " + createQuery.getSingleResult());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void getMaxSalaryOfEmployees() {
		try (Session session = Utility.getSessionFactory().openSession()) {

			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Double> criteriaQuery = builder.createQuery(Double.class);

			Root<Employee> root = criteriaQuery.from(Employee.class);

			criteriaQuery.select(builder.max(root.get("salary")));

			Query<Double> createQuery = session.createQuery(criteriaQuery);
			System.err.println("MAXIMUM SALARY OF EMPLOYEES : " + createQuery.getSingleResult());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void getTotalNoOfEmployees() {
		try (Session session = Utility.getSessionFactory().openSession()) {

			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Long> criteriaQuery = builder.createQuery(Long.class);

			Root<Employee> root = criteriaQuery.from(Employee.class);

			criteriaQuery.select(builder.count(root));

			Query<Long> createQuery = session.createQuery(criteriaQuery);
			System.err.println("TOTAL NO OF EMPLOYEES : " + createQuery.getSingleResult());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void getTotalNoOfDistinctEmployees() {
		try (Session session = Utility.getSessionFactory().openSession()) {

			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Long> criteriaQuery = builder.createQuery(Long.class);

			Root<Employee> root = criteriaQuery.from(Employee.class);

			criteriaQuery.select(builder.countDistinct(root));

			Query<Long> createQuery = session.createQuery(criteriaQuery);
			System.err.println("TOTAL NO OF DISTINCT EMPLOYEES : " + createQuery.getSingleResult());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
