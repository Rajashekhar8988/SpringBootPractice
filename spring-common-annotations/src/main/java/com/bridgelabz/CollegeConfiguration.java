package com.bridgelabz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan (basePackages= "com.bridgelabz")
@PropertySource("application.properties")

public class CollegeConfiguration {
	
	/*@Bean
	public Teacher mathTeacherBean() {
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalBean() {
		Principal principal = new Principal();
		return principal;
	}
	
	@Bean
	public College collegeBean() 
	{
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
	}*/

}
