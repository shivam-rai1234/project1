package com.example.finalproject_abhitayu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ControllerTest {
	@Autowired
	private Controller c;
	@Test
	void testcase1() {
		
		
		List<InstituteEntity> ans = c.joincourse("Java");
		int tr = ans.get(0).getCourse_id();
		String name = ans.get(0).getCourse_name();
		assertEquals(name,"Java");
		assertEquals(tr,101);
		List<InstituteEntity> ans1 = c.joincourse("Python");
		int tr1 = ans1.get(0).getCourse_id();
		String name1 = ans1.get(0).getCourse_name();
		assertEquals(name1,"Python");
		assertEquals(tr1,106);
	}
}
