package com.kasarla.springbootpostgresql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kasarla.springbootpostgresql.model.Testcase;
import com.kasarla.springbootpostgresql.repository.TestcaseRepository;

@Service
public class TestcaseService {
	
	@Autowired
	private TestcaseRepository testcaseRepository;
	
	private boolean existsById(Long testcaseid) {
		return testcaseRepository.existsById(testcaseid);
	}
	
	public List<Testcase> findAll() {
		List<Testcase> QAAutomation = testcaseRepository.findAll();
		return QAAutomation;
	}
}
