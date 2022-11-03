package com.example.database.databaseInteraction;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DatabaseInteractionApplicationTests {

	@Autowired
	private EmpService emps;

	@Test
	void contextLoads() {

		List<String> emp = emps.getSample();

		List<String> comp = new ArrayList<String>();
		comp.add("Aakash");
		comp.add("Aarav");
		comp.add("aman");

		Assert.assertEquals(comp, emp); //Comparing the lists records
		Assert.assertEquals(emp.size(), 3); //Checking how many records are found

	}

}
