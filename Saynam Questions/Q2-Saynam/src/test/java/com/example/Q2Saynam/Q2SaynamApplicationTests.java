package com.example.Q2Saynam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Q2SaynamApplicationTests {

	@Test
	void contextLoads() {
		EmployeeController c = new EmployeeController ();
		List<String> ans = c.getName();
		assertEquals(ans.size(),3);
	}
}
