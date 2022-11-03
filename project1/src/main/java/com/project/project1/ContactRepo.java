package com.project.project1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContactRepo extends JpaRepository<ContactEntity,Integer>
{
	
	@Query(value = "Select * From contact", nativeQuery = true)
	public List<ContactEntity> getjoin1();
	
	@Query(value = "Select * From contact where support_id=112", nativeQuery = true)
	public List<ContactEntity> getjoin2();

	@Query(value = "Select * From contact where support_id=0", nativeQuery = true)
	public List<ContactEntity> getjoin3();

}