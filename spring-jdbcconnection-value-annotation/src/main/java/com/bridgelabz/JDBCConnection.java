package com.bridgelabz;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class JDBCConnection {
	
	@Value("${jdbc.url}")
	private String url;	
	
	@Value("${jdbc.userName}")
	private String userName;
	
	@Value("${jdbc.password}")
	private String password;
	
	@Value("${jdbc.driver}")
	private String driver;
	
	public void display() {
		System.out.println("your url is : " + url +"\nyour username is : "+userName+ "\nyour password is : " +password+ "\nyour driver is : "+driver);
	}
	
	public void getJDBCConnection() throws Exception{
		
       	 Class.forName(driver);
       	 Connection connect=DriverManager.getConnection(url,userName,password);
       	 System.out.println("Connection is successfull...!!!    "+connect);
	}
}
       

