package com.project.project1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ContactRepo extends JpaRepository<ContactEntity,Integer>
{
	

	@Query(value = "Select * From contact where support=Emergency", nativeQuery = true)
	public List<ContactEntity> getjoin1();

	@Query(value = "Select * From client1 where support=Emergency", nativeQuery = true)
	public List<ContactEntity> getjoin2();

}