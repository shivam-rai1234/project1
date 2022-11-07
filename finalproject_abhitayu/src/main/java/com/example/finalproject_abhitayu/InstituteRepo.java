package com.example.finalproject_abhitayu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InstituteRepo extends JpaRepository<InstituteEntity,Integer>{
	
	@Query(value="select * from institute i where i.course_name = ?1",nativeQuery=true)
	List<InstituteEntity> getjoin(String course_name);
}
