package com.kpi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpi.entity.Employee;
import com.kpi.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	public List<Employee> fetchAllEmployeeByCharacterA() {
		return repo.getByCharacterA();
	}

}
