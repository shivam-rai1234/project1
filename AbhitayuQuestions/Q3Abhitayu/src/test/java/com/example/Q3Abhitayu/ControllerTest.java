package com.example.Q3Abhitayu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ControllerTest {
	@Test
	void testcase() {
		Controller c = new Controller();
		List<String>ans = c.getfromA();
		String value = ans.get(0);
		assertEquals(value,"Abhitayu");
	}
}
