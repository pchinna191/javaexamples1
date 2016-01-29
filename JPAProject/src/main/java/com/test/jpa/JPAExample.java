package com.test.jpa;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.test.pojo.Student;
public class JPAExample {
	public static void main(String s[]){
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager emManager = emFactory.createEntityManager();
		
		Student student = emManager.find(Student.class, 5432);
		
		System.out.println("Student ############ " + student);
		
		emManager.close();
		/*EntityTransaction transaction = emManager.getTransaction();
		//Begin --> Insert/Create , Update , Delete
		transaction.begin();
		
		//DB Oeprations
	
		//Insert
		Student student = new Student(5432,"Tao","MS",new BigDecimal("1234.5"));
		emManager.persist(student);
		transaction.commit();
		emManager.close();*/
	}
}
