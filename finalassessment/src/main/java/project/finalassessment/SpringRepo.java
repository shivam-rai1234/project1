package project.finalassessment;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface SpringRepo extends JpaRepository<SpringEntity ,Integer> {

	@Query(value = " select * from spring where experience>5 ",nativeQuery=true)
	List<SpringEntity> findvalues();
	
	@Query(value = " select * from spring where experience<5 ",nativeQuery=true)
	List<SpringEntity> findvalues1();
}

