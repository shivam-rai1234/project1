package com.example.Q3shivam_rai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleController {
	@Autowired
	private EmployeeRepo c1;
	
	@GetMapping("/A")
	public List<EmployeeEntity> getjoi(){
		
		return c1.getjoin("a");
}
}