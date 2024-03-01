package com.entity.example;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.entity.Call;
import com.entity.Person;
import com.entity.Phone;
import com.entity.insert.Utility;

public class CriteriaQueryMultipleRootsExampleTwo {

	public static void main(String[] args) {

		try (Session session = Utility.getSessionFactory().openSession()) {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Phone> criteriaQuery = builder.createQuery(Phone.class);
			Root<Phone> root = criteriaQuery.from(Phone.class);
			root.fetch("person");
			root.fetch("calls");

			criteriaQuery.where(builder.isNotEmpty(root.get("calls")));

			Query<Phone> query = session.createQuery(criteriaQuery);

			List<Phone> resultList = query.getResultList();
			
			for (Phone phone : resultList) {
			
				Person person = phone.getPerson();
				System.err.println(" PERSON : " + person);
				
//				List<Phone> phones = person.getPhones();
//				
//				for (Phone phone2 : phones) {
//					System.err.println(" PHONE FROM PERSON : " + phone2);
//				
//					List<Call> calls = phone2.getCalls();
//					for (Call call : calls) {
//						System.err.println(" CALL FROM PHONE FROM PERSON : " + call);
//					}
//				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
