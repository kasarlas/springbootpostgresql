package com.kasarla.springbootpostgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kasarla.springbootpostgresql.model.Testcase;

@Repository
public interface TestcaseRepository extends JpaRepository<Testcase, Long> {

}