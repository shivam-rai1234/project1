package com.example.Final.App;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface FinalRepo extends JpaRepository<FinalEntity,Integer> {


	@Query(value = "select * from runtime c where c.id = ?1",nativeQuery = true)
	List<FinalEntity> getJoin(Integer id);
}
