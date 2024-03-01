package com.entity.example;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.entity.Person;
import com.entity.Phone;
import com.entity.insert.Utility;

public class CriteriaQueryParametrizeExample {

	public static void main(String[] args) {

		try (Session session = Utility.getSessionFactory().openSession()) {
			String nameParameter = "AAA";
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Person> criteriaQuery = builder.createQuery(Person.class);
			Root<Person> root = criteriaQuery.from(Person.class);

			ParameterExpression<String> parameterName = builder.parameter(String.class);

			criteriaQuery.where(builder.equal(root.get("name"), parameterName));

			Query<Person> createQuery = session.createQuery(criteriaQuery);
			// setting the parameter name
			createQuery.setParameter(parameterName, nameParameter);

			List<Person> resultList = createQuery.getResultList();
			resultList.forEach(System.out::println);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
