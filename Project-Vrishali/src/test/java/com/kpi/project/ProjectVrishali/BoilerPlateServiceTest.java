package com.kpi.project.ProjectVrishali;

import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author VrishaliMore
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BoilerPlateServiceTest {

	@Autowired 
	private BoilerPlateService bs;
	
	@Autowired
	private BoilerPlateController controller;
	
	@DisplayName("test to check how many entries in table ")
	@Test
	public void testboilerdata() {
		List<BoilerPlateEntity> b= bs.getallCode();		
		Assert.assertEquals(b.size(),6);
	}
	
	@DisplayName("test to check boilerplate code in table ")
	@Test
	public void testboilerplateData() {
		List<String> b= controller.getdata();		
		Assert.assertEquals(b,controller.getdata());
	}
	
}
