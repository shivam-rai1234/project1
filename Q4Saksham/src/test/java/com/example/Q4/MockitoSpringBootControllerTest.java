package com.example.Q4;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MockitoSpringBootControllerTest {
	 @Test
	    public void testGetUserById() {
	        SpringBootController sbc = new SpringBootController();
	        String sb = SpringBootController.get("reasons");
	        assertEquals("reasons", sbc.get("reasons"));
	        
	        JakartaEEController jec = new JakartaEEController();
	        String jc = JakartaEEController.get("reasons");
	        assertEquals("reasons", jec.get("reasons"));
	    
	 }
}
