package com.example.Q2EmpTableAbhitayu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ControllerTest {
	@Test
	void testing() {
		Controller c = new Controller ();
		List<String> ans = c.getdata();
		assertEquals(ans.size(),3);
	}
}
