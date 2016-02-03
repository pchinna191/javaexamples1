package com.test.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.test.pojo.User;

public class CriteriaExample {
	public static void main(String[] args) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example");
		EntityManager emManager = emFactory.createEntityManager();
		
		/* Select N+1 issue : Performance */
		CriteriaBuilder cb = emFactory.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		
		Root<User> root = cq.from(User.class);
		
		cq.select(root);
		
		
		TypedQuery<User> query =emManager.createQuery(cq);
		
		for(User user:query.getResultList()){
			System.out.println(" $$$$$$$$$$$ Name  : " + user.getSname() + " -->  Course " + ((user.getCourse() != null) ? user.getCourse().getCname() : null) );
		}
		
		
		
		
		emManager.close();
	}
}
