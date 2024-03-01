package com.entity.insert;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.entity.Employee;

public class InsertEmployeeMain {

	public static void main(String[] args) {

		try (Session sessionObject = Utility.getSessionFactory().openSession()) {

			sessionObject.getTransaction().begin();

			sessionObject.save(new Employee("FFF", 70000, "aaa@gmail.com", new Date()));
			sessionObject.save(new Employee("GGG", 80000, "bbb@gmail.com", new Date()));
			sessionObject.save(new Employee("HHH", 90000, "ccc@gmail.com", new Date()));
			sessionObject.save(new Employee("III", 100000, "ddd@gmail.com", new Date()));
			sessionObject.save(new Employee("JJJ", 11000, "eee@gmail.com", new Date()));

			sessionObject.getTransaction().commit();
			System.out.println("RECORD STORED");
		} catch (HibernateException exception) {
			exception.printStackTrace();
		}
	}
}