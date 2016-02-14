package com.test.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.jdbc.dao.StudentDTO;
import com.test.jdbc.dao.StudentJDBCDAO;
public class SpringJDBCApp {
public static void main(String[] args) {
		
		//Spring Container
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("spring-jdbc-context.xml");
		
		StudentJDBCDAO studentDAO = springContainer.getBean(StudentJDBCDAO.class);
		
		/*StudentDTO studentDTO = studentDAO.getStudent(102);
		System.out.println(studentDTO);*/
		
		//New Record
		studentDAO.save(new StudentDTO(6111, "Rao", "MS", 4567));
		
		//Delete
		/*studentDAO.delete(101);*/
		
		//Get All students
		System.out.println(studentDAO.getAllStudents());
		
	}
}
