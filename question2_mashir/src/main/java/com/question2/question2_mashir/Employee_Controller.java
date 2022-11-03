package com.question2.question2_mashir;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee_Controller {
	@Autowired
	private EmployeeRepo er;
	//for putting on web page localhost:8080/id
	@GetMapping("/id")
//For calling only integer type data type data 
	public ArrayList<Integer> getempid() {
		ArrayList<Integer> eid = new ArrayList<Integer>();
		for (EmployeeEntity emt : er.findAll()) {

			eid.add(emt.getEmpid());
		}

		return eid;
	}

}
