package com.example.Q4;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Q4ApplicationTests {
	
	@Autowired
	private SpringBootController sbc;
	
	@Test
	void contextLoads() {
		
		List<SpringBootEntity> sb = sbc.getSample();
		List<String> sb1 = new ArrayList<String>();
		sb1.add("Spring is Supportive");
		sb1.add("Spring is fast");
		sb1.add("Spring is flexible");
		
		//Assert.assertEquals(sb1, sb);
		//Assert.assertEquals(sb.size(), "Spring is fast");
			
	}

}
