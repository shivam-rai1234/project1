package com.example.project1.nirata_project;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsersRepo extends JpaRepository<UsersEntity, Integer> {
@Query(value="select * from users u where u.userid= ?1", nativeQuery=true)
public List<UsersEntity> getfrequency_of_logging_time(Integer userid);
}
