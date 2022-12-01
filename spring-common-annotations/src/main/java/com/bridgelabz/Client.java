package com.bridgelabz;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(CollegeConfiguration.class);		
		College collegeObject=context.getBean("college",College.class);
		System.out.println("The college object created by spring is :" + collegeObject);
		collegeObject.test();
		context.close();
	}

}
