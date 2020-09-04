package com.kasarla.springbootpostgresql.model;

import java.util.Date;

public class Client {
	private long client_id;
	private String first_name;
	private String last_name;
	private Date birthday;
	private long payment_id;
	private long pet_id;
	
	public Client(String first_name, String last_name, Date birthday, long payment_id, long pet_id) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.birthday = birthday;
		this.payment_id = payment_id;
		this.pet_id = pet_id;
	}

	public long getClient_id() {
		return client_id;
	}

	public void setClient_id(long client_id) {
		this.client_id = client_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public long getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(long payment_id) {
		this.payment_id = payment_id;
	}

	public long getPet_id() {
		return pet_id;
	}

	public void setPet_id(long pet_id) {
		this.pet_id = pet_id;
	}
	

}
