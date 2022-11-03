package com.example.Q3shivam_rai;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer>{
	@Query(value = " SELECT * FROM Employee WHERE employee_name LIKE 'A%'", nativeQuery = true)

	public List<EmployeeEntity> getjoin(String name);


}
