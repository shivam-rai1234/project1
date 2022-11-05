package com.kpi.project.ProjectVrishali;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author VrishaliMore
 *
 */
@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {

	
}
