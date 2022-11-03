package com.kpi.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kpi.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query(value = " SELECT * FROM employee WHERE employee_name LIKE 'A%'", nativeQuery = true)
		public List<Employee> getByCharacterA();
	
}
