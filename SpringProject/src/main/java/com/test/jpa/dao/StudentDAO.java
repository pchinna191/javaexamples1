package com.test.jpa.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAO extends GenericHibernateDao<Student, Integer> {

}
