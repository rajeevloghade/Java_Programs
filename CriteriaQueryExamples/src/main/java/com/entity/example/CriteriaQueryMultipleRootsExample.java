package com.entity.example;

import java.util.List;

import javax.persistence.Tuple;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.entity.Partner;
import com.entity.Person;
import com.entity.Phone;
import com.entity.insert.Utility;

public class CriteriaQueryMultipleRootsExample {

	public static void main(String[] args) {
		getEmployeeInfo();
	}

	private static void getEmployeeInfo() {
		try (Session session = Utility.getSessionFactory().openSession()) {

			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Tuple> criteriaQuery = builder.createQuery(Tuple.class);

			// Multiple roots
			Root<Person> rootPerson = criteriaQuery.from(Person.class);
			Root<Partner> rootPartner = criteriaQuery.from(Partner.class);
			criteriaQuery.multiselect(rootPerson, rootPartner);

			// Applying predictionOne (equal AND isNotEmpty)
			Predicate predicateOne = builder.and(builder.equal(rootPerson.get("address"), "Delhi"),
					builder.isNotEmpty(rootPerson.get("phones")));

			// Applying predictionTwo (like AND equal)
			Predicate predicateTwo = builder.and(builder.like(rootPartner.get("name"), "%a%"),
					builder.equal(rootPartner.get("version"), 1));

			// Applying where clause and passing predictions
			criteriaQuery.where(builder.and(predicateOne, predicateTwo));

			List<Tuple> resultList = session.createQuery(criteriaQuery).getResultList();
			for (Tuple tuple : resultList) {
				Person person = tuple.get(0, Person.class);
				System.out.println(person);
				System.out.println("___________________________");
				List<Phone> phones = person.getPhones();
				for (Phone phone : phones) {
					System.out.println(phone);
					System.out.println("___________________________");
				}
				Partner partner = tuple.get(1, Partner.class);
				System.out.println(partner);
				System.out.println("_________________________________________");
			}

		} catch (HibernateException hibernateException) {
			hibernateException.printStackTrace();
		}
	}

}
