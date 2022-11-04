package com.kpi_project_vaishnavi.project_vaishnavi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AdvantagesRepo extends JpaRepository<AdvantagesEntity,Integer>
{
	@Query(value="SELECT * from advantages a where a.id= ?1",nativeQuery=true)
	public List<AdvantagesEntity> getadvantages(Integer id);
	
	@Query(value="SELECT * from advantages" ,nativeQuery=true)
	public List<AdvantagesEntity>getadvantages1(Integer id);
}
