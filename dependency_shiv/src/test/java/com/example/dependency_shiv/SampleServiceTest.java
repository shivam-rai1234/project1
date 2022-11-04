package com.example.dependency_shiv;

import java.util.List;

import org.junit.Assert;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest

public class SampleServiceTest {
	@Autowired
	private SampleSerivce a;
	@Test
    public void chngumangu() {
			
	List<DependencyEntity> depo_name=a.getSample();
	 Assert.assertEquals(depo_name.get(3).getDep_name(),"jdbc");
	 Assert.assertEquals(depo_name.get(0).getDep_name(),"actuator");
}
}


