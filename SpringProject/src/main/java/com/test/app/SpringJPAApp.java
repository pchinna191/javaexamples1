package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dto.StudentDTO;
import com.test.jpa.service.StudentService;

public class SpringJPAApp {
public static void main(String[] args) {
		
		//Spring Container
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("spring-jpa-context.xml");
		System.out.println(springContainer);
		
		StudentService studentService = springContainer.getBean(StudentService.class);
		StudentDTO studentDTO = studentService.getStudent(120);
		System.out.println(studentDTO);
	}
}
