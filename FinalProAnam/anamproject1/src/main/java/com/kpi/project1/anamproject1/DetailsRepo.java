package com.kpi.project1.anamproject1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DetailsRepo extends JpaRepository<DetailsEntity, Integer>  {
	@Query(value="SELECT * from details d where d.sr_no= ?1",nativeQuery=true)
	public List<DetailsEntity> getdetail1(Integer sr_no);
	
}
