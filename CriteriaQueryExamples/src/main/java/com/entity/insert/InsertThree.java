package com.entity.insert;

import java.util.Arrays;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.entity.Call;
import com.entity.Person;
import com.entity.Phone;
import com.entity.PhoneType;

public class InsertThree {

	public static void main(String[] args) {

		Session sessionObject = Utility.getSessionFactory().openSession();

		try {
			sessionObject.getTransaction().begin();

			// Person One created
			Person person = new Person();
			person.setName("CCC");
			person.setAddress("Bhopal");
			person.setVersion(2);
			person.setCreatedOn(new Date());

			// Phone one created and assigned with personOne
//			Phone phoneOne = new Phone(person, "7898123456", PhoneType.MOBILE);
			Phone phoneOne = new Phone();
			phoneOne.setPerson(person);
			phoneOne.setNumber("7898123456");
			phoneOne.setPhoneType(PhoneType.MOBILE);
			phoneOne.setCalls(Arrays.asList(new Call(30, phoneOne, new Date()), new Call(20, phoneOne, new Date())));

			person.setPhones(Arrays.asList(phoneOne));

			// Person Two created
			Person personTwo = new Person();
			personTwo.setName("DDD");
			personTwo.setAddress("Mumbai");
			personTwo.setVersion(2);
			personTwo.setCreatedOn(new Date());

			// Phone two created and assigned with personTwo
//			Phone phoneTwo = new Phone(personTwo, "9837233456", PhoneType.MOBILE);
			Phone phoneTwo = new Phone();
			phoneTwo.setPerson(personTwo);
			phoneTwo.setNumber("9837233456");
			phoneTwo.setPhoneType(PhoneType.MOBILE);
			phoneTwo.setCalls(Arrays.asList(new Call(60, phoneTwo, new Date()), new Call(50, phoneTwo, new Date())));

			person.setPhones(Arrays.asList(phoneTwo));

			// Phone three created and assigned with personThree
//			Phone phoneThree = new Phone(personTwo, "536476", PhoneType.LAND_LINE);
			Phone phoneThree = new Phone();
			phoneThree.setPerson(personTwo);
			phoneThree.setNumber("536476");
			phoneThree.setPhoneType(PhoneType.LAND_LINE);
			phoneThree.setCalls(Arrays.asList(new Call(120, phoneThree, new Date())));

			personTwo.setPhones(Arrays.asList(phoneThree));

			sessionObject.save(person);
			sessionObject.save(personTwo);

			sessionObject.getTransaction().commit();
			System.out.println("RECORD STORED");
		} catch (HibernateException exception) {
			exception.printStackTrace();
		} finally {
			if (sessionObject != null) {
				sessionObject.close();
			}
		}
	}
}
