package com.example.Q4;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Q4ApplicationTests {
	
	@Test
	static void contextLoads() {
		SpringBootController sbc = new SpringBootController();
        String sb = SpringBootController.get("reasons");
        assertEquals("reasons", sbc.get("reasons"));
        
        JakartaEEController jec = new JakartaEEController();
        String jc = JakartaEEController.get("reasons");
        assertEquals("reasons", jec.get("reasons"));
			
	}

}
