package com.example.Q3.vrishali;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmpServiceTest {
	
	@Autowired
	private EmpService ps;
	
	
	@DisplayName("Test for how many employee in table")
	@Test	
	public void EmpTest() {
		List<EmpEntity> list=ps.getall();	
		assertEquals(list.size(),5);
	}
	

}
