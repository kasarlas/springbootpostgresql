package com.kasarla.springbootpostgresql.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="tester")
public class Tester {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//generate the next number
	@Column(name="tester_id")
	private long testerid;

	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="designation")
	private String designation;

	public Tester() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tester(String firstname, String lastname, String designation) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.designation = designation;
	}

	public long getTesterid() {
		return testerid;
	}

	public void setTesterid(long testerid) {
		this.testerid = testerid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
