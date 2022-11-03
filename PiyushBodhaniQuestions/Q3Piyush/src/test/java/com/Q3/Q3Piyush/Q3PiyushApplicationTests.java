package com.Q3.Q3Piyush;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Q3PiyushApplicationTests {
	@Autowired
	private EmployeeeeRepository er;

	@Test
	void contextLoads() {
		Boolean check = er.existsById(5);
		assertEquals(check, true);
	}

}
