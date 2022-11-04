package com.Question3.question3;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer>{
	@Query(value = " SELECT * FROM employee WHERE empname LIKE 'A%'", nativeQuery = true)	
	public List<EmployeeEntity> getjoin(String empname);
}
