package com.example.Q3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Q3ApplicationTests {
	@Autowired
	private SampleController e2;

	@Test
	void contextLoads() {
		List<EmployeeEntity> e1 = e2.getEasy();
		List<String> abc = new ArrayList<String>();
		abc.add("Anishh");
		abc.add("Amit");
		abc.add("Ajay");
		abc.add("Aradhya");
		
		Assert.assertEquals(abc, e1);
		Assert.assertEquals(e1.size(), 4);
	}

}
