package com.bridgelabz;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		
		System.out.println(" Hi i am your math teacher");
		System.out.println(" My name is Rahul");

	}

}
