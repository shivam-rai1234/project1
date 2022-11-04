package com.Finalproject_Akanksha.Akanksha_project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManagementService {

	@Autowired
	private EmployeeManagementRepo emr;
	
	public List<EmployeeManagementEntity> getsample(){
		ArrayList<EmployeeManagementEntity> tm= new ArrayList<EmployeeManagementEntity>();
		for(EmployeeManagementEntity emt:emr.findAll()) {
			EmployeeManagementEntity temp=new EmployeeManagementEntity();
			temp.setId(emt.getId());
			temp.setEmp_name(emt.getEmp_name());
			temp.setExperience(emt.getExperience());
			temp.setDepartment(emt.getDepartment());
			temp.setSalary(emt.getSalary());
			temp.setSex(emt.getSex());
			
			tm.add(temp);
			
		}
		return emr.findAll();
	}
	
}
