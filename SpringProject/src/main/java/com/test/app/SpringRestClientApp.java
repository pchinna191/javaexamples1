package com.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;

import com.test.restclient.IPDetails;

public class SpringRestClientApp {

	public static void main(String s[]){
		//Spring Container
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("restContext.xml");
				
		RestTemplate restTemplate = springContainer.getBean(RestTemplate.class);
		
		//Student student = restTemplate.getForObject("http://localhost:8080/WebAppProject/mvc/student/{sno}", Student.class,102);
				
		//System.out.println(student);
		
		IPDetails ipDetails = restTemplate.getForObject("http://freegeoip.net/json/", IPDetails.class);
		
		System.out.println(ipDetails);
		
	}
}
