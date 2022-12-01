package com.bridgelabz;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${student.name}")
	private String name;
	
	@Value("${student.intrestedCourse}")
	private String intrestedCourse;
	
	@Value("${student.id}")
	private int id;
	
	
	public void displayStudentInfo() {
		System.out.println(
				"Student name is : " + name + "\nIntrested course is : " + intrestedCourse + "\nId number is : " + id);
	}

}
