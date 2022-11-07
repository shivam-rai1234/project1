package com.example.Final.App;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FinalAppApplicationTests {

	@Autowired
    private FinalController c;
	@Test
	void contextLoads() {    
	        List<FinalEntity> ans = c.getSample();
	        int test1 = ans.get(0).getId();
	        assertEquals(test1,6);
	        
	        int test2 = ans.get(1).getId();
	        assertEquals(test2,7);
	    }
	}


