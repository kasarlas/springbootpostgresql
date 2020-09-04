package com.kasarla.springbootpostgresql.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="run")
public class Run {

	//Schema : id firstName lastName email
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//generate the next number
		@Column(name="run_id")
		private long runid;
		
		@Column(name="result")
		private String result;
		
		@Column(name="run_date")
		private Date rundate;
		
		@Column(name="run_by")
		private int runby;
		
		@Column(name="fail_reason")
		private String failreason;
		
		@Column(name="testcase_id")
		private int testcaseid;

		public Run() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Run(String result, Date rundate, int runby, String failreason, int testcaseid) {
			super();
			this.result = result;
			this.rundate = rundate;
			this.runby = runby;
			this.failreason = failreason;
			this.testcaseid = testcaseid;
		}

		public long getRunid() {
			return runid;
		}

		public void setRunid(long runid) {
			this.runid = runid;
		}

		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public Date getRundate() {
			return rundate;
		}

		public void setRundate(Date rundate) {
			this.rundate = rundate;
		}

		public int getRunby() {
			return runby;
		}

		public void setRunby(int runby) {
			this.runby = runby;
		}

		public String getFailreason() {
			return failreason;
		}

		public void setFailreason(String failreason) {
			this.failreason = failreason;
		}

		public int getTestcaseid() {
			return testcaseid;
		}

		public void setTestcaseid(int testcaseid) {
			this.testcaseid = testcaseid;
		}

}