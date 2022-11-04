package com.project1.Question3;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{

	@Query(value = " SELECT * FROM Employee WHERE Name LIKE 'A%'", nativeQuery = true)
	public List<EmployeeEntity> getjoin1(String Name);

}
