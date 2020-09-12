package com.kasarla.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kasarla.springbootpostgresql.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
