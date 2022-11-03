package com.example.que3Nidhi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeRepo er;
	
	// health can be checked by passing /actuator/health as end point in localhost:8080
	//This code interacts with sql database and will fetch results
	@GetMapping("/A")
	public List<EmployeeEntity> getnames(){
		ArrayList<EmployeeEntity> val = new ArrayList<EmployeeEntity>();
		for(EmployeeEntity em:er.findAll()) {
			EmployeeEntity temp = new EmployeeEntity();
			if (em.getEmpname().startsWith("A")){
				temp.setEmpid(em.getEmpid());
				temp.setEmpname(em.getEmpname());
				temp.setSalary(em.getSalary());
	           val.add(temp);
				
			}
			
		}
		return val;
	}

}
