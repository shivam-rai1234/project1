package com.example.EmployeeDatabase.Question2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class Employee_TestCases {
	
	@Test
	public void EmployeeController() {
		EmployeeController e = new EmployeeController();
		List<String> ans = e.getid();
		assertEquals(ans.size(),1);
		
		
	}
}
		
		


