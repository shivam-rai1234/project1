package com.KPI.Question2.Question2_Abhishek;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository emprepo_ob;
	
	public List<EmployeeEntity> list(){
		return (List<EmployeeEntity>) emprepo_ob.findAll();	}

}
