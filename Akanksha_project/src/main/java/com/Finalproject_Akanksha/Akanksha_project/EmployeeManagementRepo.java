package com.Finalproject_Akanksha.Akanksha_project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface EmployeeManagementRepo extends JpaRepository<EmployeeManagementEntity,Integer>{

	@Query(value="select * from management where department='Finance';",nativeQuery=true)
	public List<EmployeeManagementEntity> getFinance(Integer a);
	
	@Query(value="select * from management where department='IT';",nativeQuery=true)
	public List<EmployeeManagementEntity> getit(Integer a);
	
	@Query(value="select * from management where department='HR';",nativeQuery=true)
	public List<EmployeeManagementEntity> gethr(Integer a);
	
	@Query(value="select * from management m where m.id= ?1",nativeQuery=true)
	public List<EmployeeManagementEntity> getindividual(Integer id);
	
	

}
