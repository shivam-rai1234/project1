package com.Quest.Q2Akanksha;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class QuestionEmployeeController {

	@Autowired
	private QuestionEmployeeRepo emp;

	@GetMapping("/id")
	public ArrayList<Integer> getSample() {
		ArrayList<Integer> transformedvalues = new ArrayList<Integer>();
		for (QuestionEmployeeEntity emt : emp.findAll()) {
			transformedvalues.add(emt.getEmp_id());
		}
		return transformedvalues;
	}
}
