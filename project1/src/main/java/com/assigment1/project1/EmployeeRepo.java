package com.assigment1.project1;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long>{

	List<Employee> getjoin(String string);

}