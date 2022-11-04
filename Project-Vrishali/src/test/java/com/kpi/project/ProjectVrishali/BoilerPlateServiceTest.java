package com.kpi.project.ProjectVrishali;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoilerPlateServiceTest {

	@Autowired 
	private BoilerPlateService bs;
	
	@DisplayName("test check how many entries in table ")
	@Test
	public void testboilerdata() {
		List<BoilerPlateEntity> b= bs.getallCode();		
		assertEquals(b.size(),5);
	}
}
