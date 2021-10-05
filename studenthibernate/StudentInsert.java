package com.tech.studenthibernate;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentInsert {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the rollnumber:");
		int rollno = s.nextInt();

		System.out.println("enter the name:");
		String name = s.next();

		System.out.println("enter the phone number:");
		long phno = s.nextLong();

		System.out.println("enter the standard:");
		String standard = s.next();
		StudentDetails studentDetails=new StudentDetails();
		studentDetails.setRollno(rollno);
		studentDetails.setName(name);
		studentDetails.setPhno(phno);
		studentDetails.setStandard(standard);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(studentDetails);
		transaction.commit();
	}

}


