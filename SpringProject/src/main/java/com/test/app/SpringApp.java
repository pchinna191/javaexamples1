package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.bean.Address;
import com.test.bean.Course;
import com.test.bean.ReferenceData;
import com.test.bean.Student;

public class SpringApp {
	
      public static void main(String[] args) {
		
		//Spring Container
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("collectionApplicationContext.xml");
		
		ReferenceData ref = springContainer.getBean(ReferenceData.class);
		
		/*Student student = springContainer.getBean("student",Student.class);
		
		Student student1 = springContainer.getBean("student",Student.class);
		Address address = springContainer.getBean(Address.class);
		
		Address address1 = springContainer.getBean(Address.class);
		
		Address address2 = springContainer.getBean(Address.class);
		
		Course course = springContainer.getBean(Course.class);
		
		System.out.println("Student " + student);
		System.out.println("Student1 " + student1);
		System.out.println("Address " + address);
		System.out.println("Address " + address1);
		System.out.println("Course " + course);
		*/
		System.out.println(ref);
	

	}
}
