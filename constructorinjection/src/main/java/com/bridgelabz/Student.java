package com.bridgelabz;

public class Student {
	
	private int id;
	private String studentName;

	public Student(int id, String studentName) {
		this.id = id;
		this.studentName = studentName;
	}

	public void displayStudentInfo() {
		System.out.println("Student name is : " + studentName);
		System.out.println("Id is : "+ id);
	}

}
