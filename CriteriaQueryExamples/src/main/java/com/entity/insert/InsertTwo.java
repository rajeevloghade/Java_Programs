package com.entity.insert;

import java.util.Arrays;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.entity.Partner;
import com.entity.Person;
import com.entity.Phone;
import com.entity.PhoneType;

public class InsertTwo {

	public static void main(String[] args) {

		try (Session sessionObject = Utility.getSessionFactory().openSession()) {

			sessionObject.getTransaction().begin();
			Person person = new Person();
			person.setName("AAA");
			person.setAddress("Delhi");
			person.setVersion(1);
			person.setCreatedOn(new Date());

			Phone phoneOne = new Phone();
			phoneOne.setPerson(person);
			phoneOne.setNumber("7898123456");
			phoneOne.setPhoneType(PhoneType.MOBILE);

			person.setPhones(Arrays.asList(phoneOne));

			Person personTwo = new Person();
			personTwo.setName("BBB");
			personTwo.setAddress("Indore");
			personTwo.setVersion(2);
			personTwo.setCreatedOn(new Date());

			Phone phoneTwo = new Phone();
			phoneTwo.setPerson(personTwo);
			phoneTwo.setNumber("233456");
			phoneTwo.setPhoneType(PhoneType.LAND_LINE);

			Phone phoneThree = new Phone();
			phoneThree.setPerson(personTwo);
			phoneThree.setNumber("536476");
			phoneThree.setPhoneType(PhoneType.LAND_LINE);

			Partner partner = new Partner("Partner", 1);

			sessionObject.save(person);
			sessionObject.save(personTwo);
			sessionObject.save(partner);

			sessionObject.getTransaction().commit();
			System.out.println("RECORD STORED");
		} catch (HibernateException exception) {
			exception.printStackTrace();
		}
	}
}