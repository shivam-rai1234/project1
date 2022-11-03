package com.Quest.Q3Akanksha;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Quest3Repo extends CrudRepository<Quest3Entity,Integer>{

	
	@Query(value="select * from employee where emp_name like 'a%'",nativeQuery=true)
	public List<Quest3Entity> getjoin(Integer a);
	
	
}
