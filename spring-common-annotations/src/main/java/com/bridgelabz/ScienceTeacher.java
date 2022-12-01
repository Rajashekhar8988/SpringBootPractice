package com.bridgelabz;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		
		System.out.println("Hi i am your science teacher");
		System.out.println("My name is Karthik");

	}

}
