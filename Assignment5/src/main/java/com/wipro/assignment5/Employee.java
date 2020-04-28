package com.wipro.assignment5;



public class Employee {
	
	
	String name;
	String email;
	String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Employee(String name, String email, String location) {
		super();
		this.name = name;
		this.email = email;
		this.location = location;
	}
	public Employee() {
		
	}
	
	
	

}
