package com.Question3.question3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SampleControllerId {
	@Autowired
	private EmployeeRepo er;
	
	@GetMapping("/A") 
			public List<EmployeeEntity> getjoin(){
			
			return er.getjoin("A");
	}
}
	
