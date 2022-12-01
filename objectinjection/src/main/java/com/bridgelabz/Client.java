package com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file loaded");
		
		Student student1Object=context.getBean("student",Student.class);
		student1Object.cheating();
		
	    Student2 student2Object=context.getBean("student1",Student2.class);
	    student2Object.startCheating();
		
	}	
}

