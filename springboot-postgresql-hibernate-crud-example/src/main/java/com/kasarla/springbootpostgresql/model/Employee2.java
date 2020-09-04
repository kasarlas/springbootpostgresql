package com.kasarla.springbootpostgresql.model;

public class Employee2 {
	private long id;
	private String fname;
	private String lname;
	private String email;
	
	
	
	public Employee2(String fname, String lname, String email) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.email = email;
}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	

}
