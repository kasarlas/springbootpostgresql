package com.kasarla.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kasarla.springbootpostgresql.model.Employee;
import com.kasarla.springbootpostgresql.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	private boolean existsById(Long id) {
		return employeeRepository.existsById(id);
	}
	
	public List<Employee> findAll() {
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}
}
