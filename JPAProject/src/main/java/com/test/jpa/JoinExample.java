package com.test.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.test.pojo.User;

public class JoinExample {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager emManager = emFactory.createEntityManager();
		
		 //Select N+1 issue : Performance 
		/*TypedQuery<User> query = emManager.createQuery("From com.test.pojo.User",User.class);
		
		for(User user:query.getResultList()){
			System.out.println(" $$$$$$$$$$$ Name  : " + user.getSname() + " -->  Course " + ((user.getCourse() != null) ? user.getCourse().getCname() : null) );
		}*/
		
		//INNER JOIN
		/*TypedQuery<User> query = emManager.createQuery("From com.test.pojo.User u JOIN FETCH u.course",User.class);
		
		for(User user:query.getResultList()){
			System.out.println(" $$$$$$$$$$$ Name  : " + user.getSname() + " -->  Course " + ((user.getCourse() != null) ? user.getCourse().getCname() : null) );
		}*/
		
		//INNER JOIN --> Selected Columns
		/*TypedQuery<Object[]> query = emManager.createQuery("Select u.sname ,u.course.cname From com.test.pojo.User u", Object[].class);
		
		for(Object[] col:query.getResultList()){
			System.out.println(" $$$$$$$$$$$ Name  : " + col[0]  + " -->  Course " + col[1]  );
		}*/
		

		/*LEFT /RIGHT JOIN --> Selected Columns*/
		/*TypedQuery<Object[]> query = emManager.createQuery("Select u,c From com.test.pojo.User u LEFT OUTER JOIN  u.course c",Object[].class);
		
		for(Object[] col:query.getResultList()){
			System.out.println(" $$$$$$$$$$$ Student  : " + col[0] + " -->  Course " + col[1]);
		}*/
		
		
		
		emManager.close();
	}
}
