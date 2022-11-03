package com.example.Q2EmpTableAbhitayu;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private EmpRepo er;
	@GetMapping("/id")
	public List<String> getdata(){
		ArrayList<String> ename=new ArrayList<String>();
    	for(EmpEntity emt:er.findAll()) {
    		ename.add(emt.getEmp_name());
    		
    	}
    	return ename;
	}
}
