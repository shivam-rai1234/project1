package com.example.Employee.Question3;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Question3ApplicationTests{

	@Test
	void contextLoads() {
		EmployeeController c = new EmployeeController ();
		List<String> ans = c.getsample3();
		assertEquals(ans.size(),3);
	
		
	}
		
		
	}
