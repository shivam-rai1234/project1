package com.FinalProject_Piyush.FinalProject_Piyush;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
/**
 * @author PiyushBodhani
 *
 */
public interface dbdetailsRepository extends CrudRepository<dbdetailsEntity, Integer> {
	
	@Query(value="select * from dbdetails i where i.db_id = ?1",nativeQuery=true)
	List<dbdetailsEntity> getjoin(Integer id );
}
