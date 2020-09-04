package com.kasarla.springbootpostgresql.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="testcase")
public class Testcase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//generate the next number
	@Column(name="testcase_id")
	private long testcaseid;
	
	@Column(name="test_scenario")
	private String testscenario;
	
	@Column(name="test_description")
	private String testdescription;
	
	@Column(name="system_id")//if it is integer??
	private int systemid;
	
	@Column(name="created_by")//if it is integer??
	private int createdby;
	
	@Column(name="created_on")//if it is Date??
	private Date createdon;
	
	@Column(name="updated_by")//if it is integer??
	private int updatedby;
	
	@Column(name="udated_on")//if it is Date??
	private Date updatedon;

	public Testcase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Testcase(String testscenario, String testdescription, int systemid, int createdby, Date createdon,
			int updatedby, Date updatedon) {
		super();
		this.testscenario = testscenario;
		this.testdescription = testdescription;
		this.systemid = systemid;
		this.createdby = createdby;
		this.createdon = createdon;
		this.updatedby = updatedby;
		this.updatedon = updatedon;
	}

	public long getTestcaseid() {
		return testcaseid;
	}

	public void setTestcaseid(long testcaseid) {
		this.testcaseid = testcaseid;
	}

	public String getTestscenario() {
		return testscenario;
	}

	public void setTestscenario(String testscenario) {
		this.testscenario = testscenario;
	}

	public String getTestdescription() {
		return testdescription;
	}

	public void setTestdescription(String testdescription) {
		this.testdescription = testdescription;
	}

	public int getSystemid() {
		return systemid;
	}

	public void setSystemid(int systemid) {
		this.systemid = systemid;
	}

	public int getCreatedby() {
		return createdby;
	}

	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedon() {
		return createdon;
	}

	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}

	public int getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(int updatedby) {
		this.updatedby = updatedby;
	}

	public Date getUpdatedon() {
		return updatedon;
	}

	public void setUpdatedon(Date updatedon) {
		this.updatedon = updatedon;
	}

	
	

}
