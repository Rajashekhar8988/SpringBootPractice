package com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Bean xml file loaded");
		((AbstractApplicationContext) context).registerShutdownHook();
		StudentDAO student = context.getBean("student", StudentDAO.class);
		student.selectAllRows();
		((ClassPathXmlApplicationContext) context).close();
	}

}
