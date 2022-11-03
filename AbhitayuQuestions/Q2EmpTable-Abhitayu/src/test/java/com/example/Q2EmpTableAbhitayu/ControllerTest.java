package com.example.Q2EmpTableAbhitayu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ControllerTest {
	@Test
	void testing() {
		SampleController c = new SampleController ();
		List<String> ans = c.getName();
		assertEquals(ans.size(),3);
	}
}
