package com.bridgelabz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("${college.collegName}")
	private String collegeName;

	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//	}
//
//
//	//by using constructor injection 
//	
//	/*public College(Principal principal) {
//		this.principal = principal;
//	}*/
//
//	//by using setter injection
//
//	public void setPrincipal(Principal principal) {
//		this.principal = principal;
//	}
	
	public void test() {
		principal.principalName();
		teacher.teach();
		System.out.println("my college name is :"+ collegeName);
		System.out.println("Testing completed ");
	}

	

}
