package com.Finalproject_Akanksha.Akanksha_project;

import java.util.List;

import org.junit.Assert;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeManagementTest {

	@Autowired
	private EmployeeManagementService obj;
	
	@Test
	
	public void method() {
		List<EmployeeManagementEntity> obj1= obj.getsample();
		
		Assert.assertEquals(obj1.size(),8);
		Assert.assertEquals(obj1.get(0).getDepartment(),"HR");
		Assert.assertEquals(obj1.get(1).getDepartment(),"Finance");
		Assert.assertEquals(obj1.get(2).getDepartment(),"IT");
		
		
		
		}
}
