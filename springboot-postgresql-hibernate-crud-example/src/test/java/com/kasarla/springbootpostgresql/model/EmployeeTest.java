package com.kasarla.springbootpostgresql.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation .class)
class EmployeeTest {
	
	protected static Employee felix;
	protected String fname = "Felix";
	protected static String Lname= "D'Cat";
	protected static String email= "felixrox@aol.com";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		felix = new Employee("fname", "Lname", "email");
	}

	@Test
	@Order(1)
	void employee_GivenThreeParameters_ShouldConstructEmployee() {
	assertTrue(felix instanceof Employee);
	assertEquals(0, felix.getId());
	assertEquals("fname", felix.getFirstName());
	assertEquals("Lname", felix.getLastName());
	assertEquals("email", felix.getEmail());
	}
	
	@Test
	@Order(2)
	void setId_GivenLong_ShouldSetId() {
		long fakeId = 100L;
		felix.setId(fakeId);
		assertEquals(fakeId, felix.getId());
		
	}

}
