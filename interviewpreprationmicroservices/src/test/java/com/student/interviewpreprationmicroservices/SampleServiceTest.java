package com.student.interviewpreprationmicroservices;

import java.util.List;
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
	private SampleService ss;
	@Test
    public void abc() {
			
	List<QuestionsEntity> qe=ss.getsamples();
	 Assert.assertEquals(qe.get(0).getTool(),"Java");
	 Assert.assertEquals(qe.get(1).getTool(),"Spring Boot");
}
}
