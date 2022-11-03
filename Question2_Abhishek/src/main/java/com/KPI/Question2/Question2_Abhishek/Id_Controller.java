package com.KPI.Question2.Question2_Abhishek;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Id_Controller {
	
	@Autowired
	private EmployeeRepository emprepo_ob2;
	
	@GetMapping("/id")
	public ArrayList<Integer> id() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (EmployeeEntity empEnt_ob : emprepo_ob2.findAll()) {

			list.add(empEnt_ob.getEmployee_id());
		}
		return list;
		
	}
	

}
