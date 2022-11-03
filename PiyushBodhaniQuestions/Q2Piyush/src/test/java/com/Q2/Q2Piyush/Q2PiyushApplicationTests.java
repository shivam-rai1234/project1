package com.Q2.Q2Piyush;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class Q2PiyushApplicationTests {

	@Test
	void contextLoads() {
		Controller c = new Controller ();
		List<String> answer = c.getdata();
		assertEquals(answer.size(),3);
	}

}
