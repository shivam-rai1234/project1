package com.KPI.Question2.Question2_Abhishek;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IDController {
	@Autowired
	private EmployeeRepository empRepo_obj;
	
	@GetMapping("/id")
	public ArrayList<Integer> id() {
		ArrayList<Integer> id_list = new ArrayList<Integer>();
		for (EmployeeEntity empEnt_obj : empRepo_obj.findAll()) {

			id_list.add(empEnt_obj.getEmployee_id());
		}
		return id_list;
		
	}

}
