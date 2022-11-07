package com.student.interviewpreprationmicroservices;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuestionsRepo extends JpaRepository<QuestionsEntity, Integer>{
	@Query(value="SELECT * from interview i where i.s_no= ?1",nativeQuery=true)
	public List<QuestionsEntity> getdetails(Integer s_no);


}
