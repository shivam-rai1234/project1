package com.example.dependency_shiv;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DependencyRepo extends JpaRepository<DependencyEntity,Integer>{
	@Query(value="SELECT * from dependency i where i.id= ?1",nativeQuery=true)
	public List<DependencyEntity> getjoin(Integer id);


}
