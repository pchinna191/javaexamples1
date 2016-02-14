package com.test.jpa.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.test.jpa.dao.pojo.Student;

@Repository
public class StudentDAO extends GenericHibernateDAO<Student, Integer> {

}
