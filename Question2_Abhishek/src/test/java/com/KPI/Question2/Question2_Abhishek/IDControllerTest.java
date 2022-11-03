package com.KPI.Question2.Question2_Abhishek;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class IDControllerTest {
	@Autowired
	private IDController idcontrollerob;
	
	@Test
	public void idTest() {
		List<Integer> actualOutput= idcontrollerob.id();
		List<Integer> expectedOutput = Arrays.asList(1,2,3);
		assertEquals(expectedOutput,actualOutput);
		
	}

}