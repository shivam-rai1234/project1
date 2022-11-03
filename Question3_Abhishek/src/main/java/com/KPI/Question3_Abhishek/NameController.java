package com.KPI.Question3_Abhishek;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
	@Autowired
	private EmployeeRepository empRepo_obj;
	
	@GetMapping("/A")
	public List<String> empNameStartswithA(){
		ArrayList<String> namesWithA=new ArrayList<String>();
    	for(EmployeeEntity empEnt_ob:empRepo_obj.findAll()) {
    		if(empEnt_ob.getEmployee_name().startsWith("A")) {
    			namesWithA.add(empEnt_ob.getEmployee_name());
    			}
    		}
		return namesWithA;
	}

}
