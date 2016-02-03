package com.test.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import com.test.pojo.Student;

 public class StudentDAO 
 {
	
	private EntityManagerFactory emFactory; 
	
	public StudentDAO(){
		emFactory = Persistence.createEntityManagerFactory("jpa-example");
	}
	
	public void save(Student student){
		EntityManager emManager = emFactory.createEntityManager();
		EntityTransaction transaction = emManager.getTransaction();
		transaction.begin();
		emManager.persist(student); // Insert New Record
		transaction.commit();
		emManager.close();
	}
	
	public void delete(int sno){
		EntityManager emManager = emFactory.createEntityManager();
		EntityTransaction transaction = emManager.getTransaction();
		transaction.begin();
		Student stuObj = (Student) emManager.find(Student.class, sno);
		if(stuObj != null)
			emManager.remove(stuObj); //Delete Record
		transaction.commit();
		emManager.close();
	}
	
	public void update(Student student){
		EntityManager emManager = emFactory.createEntityManager();
		EntityTransaction transaction = emManager.getTransaction();
		transaction.begin();
		emManager.merge(student); //Update Record
		transaction.commit();
		emManager.close();
	}
	
	public Student findBySno(int sno){
		EntityManager emManager = emFactory.createEntityManager();
		return emManager.find(Student.class, sno); //Read Record 
	}
	
	public List<Student> getAllStudents(){
		EntityManager emManager = emFactory.createEntityManager();
		 return emManager.createQuery("From com.test.pojo.Student",Student.class).getResultList();
	}
	
	public List<Student> getAllStudentsByFee(BigDecimal  fee){
		EntityManager emManager = emFactory.createEntityManager();
		TypedQuery<Student> query = emManager.createQuery("From com.test.pojo.Student stu where stu.fee > ?",Student.class);
		query.setParameter(1,fee);
		return query.getResultList();
	}
	
	public List<Student> getAllStudentsByName(String   name){
		EntityManager emManager = emFactory.createEntityManager();
		//TypedQuery<Student> query = emManager.createQuery("From com.test.pojo.Student stu where stu.sname like ?",Student.class);
		TypedQuery<Student> query = emManager.createNamedQuery("findByName",Student.class);
		query.setParameter("name", name);
		return query.getResultList();
	}

}	
	
