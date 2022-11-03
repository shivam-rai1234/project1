package com.example.ques2Nidhi;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTest {
	
	@Autowired
	private EmployeeRepo er;
	
	@Test
	public void check() {
		List<EmployeeEntity> employee = (List<EmployeeEntity>) er.findAll();
		Assert.assertEquals(employee.size(),3);
	}

}
