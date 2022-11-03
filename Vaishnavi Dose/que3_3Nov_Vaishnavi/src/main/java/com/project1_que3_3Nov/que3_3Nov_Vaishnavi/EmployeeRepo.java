package com.project1_que3_3Nov.que3_3Nov_Vaishnavi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>
{
	@Query(value = " SELECT * FROM Emp WHERE employee_name LIKE 'A%'", nativeQuery = true)
	public List<EmployeeEntity> getjoin(String name);
	
}