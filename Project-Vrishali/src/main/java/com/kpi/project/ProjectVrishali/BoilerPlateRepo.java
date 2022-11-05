package com.kpi.project.ProjectVrishali;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author VrishaliMore
 *
 */
@Repository
public interface BoilerPlateRepo extends JpaRepository<BoilerPlateEntity, Integer>{
	
	@Query(value="select *from  Boilerplate INNER JOIN user ON Boilerplate.BoilerPlate_code=user.user_code",nativeQuery=true)
	List<BoilerPlateEntity> userenterboilerplate();
}
