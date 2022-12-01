package com.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class StudentDAO {

	private String driver;
	private String url;
	private String userName;
	private String password;
	
	Connection con;
	

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		System.out.println("setting driver....");
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		System.out.println("setting url...");
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("setting userName....");
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("setting password....");
		this.password = password;
	}
	public void init() throws Exception {
		System.out.println("inside the custom init method");
		createStudentDBonnection();
	}
	
	public void createStudentDBonnection() throws Exception{
		
		System.out.println("creating connection ...");
		//load driver
		Class.forName(driver);
		
		//get a connection
		con=DriverManager.getConnection(url,userName,password);
		
	}
	
	public void selectAllRows() throws SQLException {
		
		System.out.println("retriving all students data ....");
		//execute query
		Statement stmt = con.createStatement();
	
		ResultSet rs=stmt.executeQuery("SELECT * FROM nani.employee;");
	
	    while(rs.next()) {
	    	
	    	int id=rs.getInt(1);
	    	String name=rs.getString(2);
	    	int age=rs.getInt(3);
	    	
	    	System.out.println("Id " + id + " Name " +name+ " Age " +age);
	    		    	
	    }
	}
	
	public void deleteStudentRecord(int studentId) throws ClassNotFoundException, SQLException {
		
	
		//execute query
		Statement stmt = con.createStatement();
	
		stmt.executeUpdate("delete from nani.employee where id ="+studentId);
		
		System.out.println("record deleted with the id "+studentId);
		
	}
	
	public void closeConnection() throws SQLException {
		
		//closing the connection
		con.close();
	}
	
	public void destroy() throws SQLException {
		System.out.println("inside destroy method..");
		//clean up job
		closeConnection();
	}
	}
	
	
	
	

