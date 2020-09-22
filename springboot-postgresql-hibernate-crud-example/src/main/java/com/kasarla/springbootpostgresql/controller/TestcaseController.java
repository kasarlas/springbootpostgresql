package com.kasarla.springbootpostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kasarla.springbootpostgresql.model.Testcase;
import com.kasarla.springbootpostgresql.service.TestcaseService;

@Controller
public class TestcaseController {
	
	@Autowired
	private TestcaseService testcaseService;
	
	@GetMapping(value = {"/", "index"})
	public String index(Model model) {
		return "index";
	}
	
	@GetMapping("/QAAutomation")
	public String getEmployees(Model model) {
		List<Testcase> testcase = testcaseService.findAll();
		model.addAttribute("QAAutomation", testcase);
		return "testcase-list";
	}
	

	}
