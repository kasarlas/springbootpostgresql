package com.kasarla.springbootpostgresql.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inputs")
public class Inputs {

	//Schema : id firstName lastName email
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//generate the next number
		@Column(name="input_id")
		private long inputid;
		
		@Column(name="run_id")
		private long runid;
		
		@Column(name="input_name")
		private String inputname;
		
		@Column(name="input_value")
		private String inputvalue;

		public Inputs() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Inputs(long runid, String inputname, String inputvalue) {
			super();
			this.runid = runid;
			this.inputname = inputname;
			this.inputvalue = inputvalue;
		}

		public long getInputid() {
			return inputid;
		}

		public void setInputid(long inputid) {
			this.inputid = inputid;
		}

		public long getRunid() {
			return runid;
		}

		public void setRunid(long runid) {
			this.runid = runid;
		}

		public String getInputname() {
			return inputname;
		}

		public void setInputname(String inputname) {
			this.inputname = inputname;
		}

		public String getInputvalue() {
			return inputvalue;
		}

		public void setInputvalue(String inputvalue) {
			this.inputvalue = inputvalue;
		}

}