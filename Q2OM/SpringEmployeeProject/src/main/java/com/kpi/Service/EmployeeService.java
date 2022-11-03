package com.kpi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpi.Entity.Employee;
import com.kpi.Repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired 
	private EmployeeRepository repo;
	
	public List<Employee> getEmployee() {
		return repo.findAll();
	}
}
