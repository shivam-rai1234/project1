package com.kpi_project_vaishnavi.project_vaishnavi;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdvantagesServiceTest 
{
	@Autowired
	private AdvantagesService usv;
	
	@Test
	public void contextLoads()
	{
		List<AdvantagesEntity> adv = usv.getser();
		
		Assert.assertEquals(adv.size(),3);
	}
	
	@Test
	public void adv() 
	{
		List<AdvantagesEntity> adv1 = usv.getser1();
		Assert.assertEquals(adv1.get(0).getField_name(),"Spring Boot");
	}
	
	@Test
	public void adva() 
	{
		List<AdvantagesEntity> adv2 = usv.getser1();
		Assert.assertEquals(adv2.get(1).getField_name(),"Java");
	}
	
	@Test
	public void advan() 
	{
		List<AdvantagesEntity> adv3 = usv.getser1();
		Assert.assertEquals(adv3.get(2).getField_name(),"JUnit");
	}
}
