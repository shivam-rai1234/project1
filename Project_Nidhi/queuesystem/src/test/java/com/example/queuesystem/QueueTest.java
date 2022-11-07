package com.example.queuesystem;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class QueueTest {
	@Autowired 
	private QueueController qc;
	
	@Test
	public void check() {
		
        
		Assert.assertEquals(qc.getfromfirst(2),1);
		Assert.assertEquals(qc.getfromback(10),0);
	}

}
