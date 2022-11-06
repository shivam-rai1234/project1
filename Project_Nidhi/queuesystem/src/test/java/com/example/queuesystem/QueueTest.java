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
	private QueueRepo qr;
	List<Integer> l = new ArrayList<Integer>();
	@Test
	public void check() {
		Deque<Integer> deque=new ArrayDeque<Integer>(); 
        for(QueueEntity emt:qr.findAll()) {
        	
        	int val = emt.getId();
        	deque.offer(val);
            }
        
        for (int i :deque) {
        	l.add(i);
        	
	    }
        
		Assert.assertEquals(l.indexOf(2),1);
	}

}
