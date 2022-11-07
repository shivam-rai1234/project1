package com.project.project1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContactRepo extends JpaRepository<ContactEntity, Integer> {

	@Query(value = "Select * From contact", nativeQuery = true)
	public List<ContactEntity> getJoin1();

	@Query(value="SELECT * from contact c where c.support_id= ?1",nativeQuery=true)
	public List<ContactEntity> getdetail1(Integer support_id);
	
}
