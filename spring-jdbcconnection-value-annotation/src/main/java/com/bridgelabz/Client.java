package com.bridgelabz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) throws Exception{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Configuration class loaded");
		JDBCConnection jdbc=context.getBean("jdbc",JDBCConnection.class);
		jdbc.display();
		jdbc.getJDBCConnection();
	}

}
