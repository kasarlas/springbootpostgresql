package com.kasarla.springbootpostgresql.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="systemundertest")
public class System_Undertest {

	//Schema : id firstName lastName email
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//generate the next number
		@Column(name="system_id")
		private long systemid;
		
		@Column(name="application_name")
		private String applicationName;
		
		@Column(name="description")
		private String description;

		public System_Undertest() {
			super();
			// TODO Auto-generated constructor stub
		}

		public System_Undertest(String applicationName, String description) {
			super();
			this.applicationName = applicationName;
			this.description = description;
		}

		public long getSystemid() {
			return systemid;
		}

		public void setSystemid(long systemid) {
			this.systemid = systemid;
		}

		public String getApplicationName() {
			return applicationName;
		}

		public void setApplicationName(String applicationName) {
			this.applicationName = applicationName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
		
}