package com.example.queuesystem;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class QueueController {
	
	@Autowired
	private QueueRepo qr;
	
	List<Integer> l = new ArrayList<Integer>();
	List<Integer> l1 = new ArrayList<Integer>();
	@GetMapping("/fifo/{id}")
	    public int getfromfirst(@PathVariable int id){
	        
	        Deque<Integer> deque=new ArrayDeque<Integer>(); 
	        for(QueueEntity emt:qr.findAll()) {
	        	
	        	int val = emt.getId();
	        	deque.offer(val);
	            }
	        
	        for (int i :deque) {
	        	l.add(i);
	        	
		    }
	        
			return l.indexOf(id);
			
	        
	       }
	    
	@GetMapping("/lifo/{id}")
    public int getfromback(@PathVariable int id){
        
        Deque<Integer> deque=new ArrayDeque<Integer>(); 
        for(QueueEntity emt:qr.findAll()) {
        	
        	int val = emt.getId();
        	deque.push(val);
            }
        
        for (int i :deque) {
        	l1.add(i);
        	
	    }
		return l1.indexOf(id);
		
        
       }

}
