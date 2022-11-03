package com.KPI.Question3_Abhishek;

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
public class NameControllerTest {
	@Autowired
	private NameController nameControllerob;
	
	@Test
	public void empNameStartsWithA_Test() {
		List<String> actualOutput= nameControllerob.empNameStartswithA();
		List<String> expectedOutput = Arrays.asList("Abhishek");
		assertEquals(expectedOutput,actualOutput);
		
	}

}
