package com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("cofig class loaded");
		
		Student raj = context.getBean("student", Student.class);
		raj.displayStudentInfo();
		
	
		
	}
	

}
