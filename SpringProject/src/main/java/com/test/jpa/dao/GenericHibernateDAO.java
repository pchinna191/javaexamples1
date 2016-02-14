package com.test.jpa.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
@SuppressWarnings("unchecked")
public class GenericHibernateDAO<T, PK extends Serializable> implements GenericDAO<T, PK> {

	private Class<T> persistentClass;


	@Autowired
	@PersistenceContext(unitName="myAppEntityManager")
	private EntityManager entityManager;


	public GenericHibernateDAO() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public T read(PK id) {
		return (T) this.entityManager.find(persistentClass, id);
	}

	public List<T> loadAll(Class<T> entityClass) {
		CriteriaQuery<T> query = this.entityManager.getCriteriaBuilder().createQuery(entityClass);
		query.from(entityClass);
		List<T> results = entityManager.createQuery(query).getResultList();
		return results;

	}

	public List<T> find(String query, String condition) {
		Query sql = this.entityManager.createQuery(query);
		sql.setParameter(1, condition);
		return sql.getResultList();
	}

	public List<T> find(String query, Long id) {
		Query sql = this.entityManager.createQuery(query);
		sql.setParameter(1, id);
		return sql.getResultList();
	}

	public T makePersistent(T entity) {
		return this.entityManager.merge(entity);
	}

	public T merge(T entity) {
		return this.entityManager.merge(entity);
	}

	public T create(T entity) {
		this.entityManager.persist(entity);
		return entity;
	}

	public void delete(Object entityObject) {
		this.entityManager.remove(entityObject);
	}

	@SuppressWarnings("hiding")
	public <T> List<T> findByNamedQueryAndNamedParam(String queryName, String[] paramNames, Object[] values) {
		Query query = entityManager.createNamedQuery(queryName);
		for (int i = 0; i < paramNames.length; i++) {
			query.setParameter(paramNames[i], values[i]);
		}
		return query.getResultList();

	}

	public Query getQuery(String sqlString) {
		return this.entityManager.createQuery(sqlString);
	}

	public Criteria getCriteria() {
		Session session = this.entityManager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(persistentClass);
		return criteria;

	}

	public Criteria getCriteria(Class<?> clazz) {
		Session session = this.entityManager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(clazz);
		return criteria;

	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}


}
